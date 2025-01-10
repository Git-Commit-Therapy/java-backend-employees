package com.git_commit_therapy.emergency.dao;

import com.git_commit_therapy.emergency.model.CalledPatient;
import com.git_commit_therapy.emergency.model.WaitingPatient;
import com.git_commit_therapy.emergency.utils.WaitingQueue;
import com.git_commit_therapy.employeeService.entity.Patient;
import com.git_commit_therapy.employeeService.entity.SeverityCode;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.git_commit_therapy.emergency.configuration.EmergencyTaskProperties;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

@Log
@Service
public class EmergencyWardDao {
    private final WaitingQueue needToBeVisited = new WaitingQueue();
    private final WaitingQueue inVisiting = new WaitingQueue();

    private final ConcurrentLinkedDeque<CalledPatient> lastPatientsCalled = new ConcurrentLinkedDeque<>();
    private final EmergencyTaskProperties taskProperties;

    @Scheduled(fixedRateString = "#{@emergencyTaskProperties.cleanOldCall * 1000}")
    public void taskCleanOldCalls() {
        log.fine("Executing task: Cleaning old calls...");
        List<CalledPatient>  lastCalls = lastPatientsCalled.stream().toList();
        for(CalledPatient call : lastCalls) {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime callTime = call.getCalledTime().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();
            //Remove if the difference is greater than the value in configuration
            if(Duration.between(callTime,now).getSeconds() > taskProperties.getMaxOldCall()){
                lastPatientsCalled.remove(call);
            }
        }
    }

    @Autowired
    public EmergencyWardDao(EmergencyTaskProperties taskProperties) {
        this.taskProperties = taskProperties;
        Comparator<WaitingPatient> comparator = new Comparator<>() {
            @Override
            public int compare(WaitingPatient o1, WaitingPatient o2) {
                return o1.getWaitingTime().compareTo(o2.getWaitingTime());
            }
        };
        needToBeVisited.setComparator(comparator);
        inVisiting.setComparator(comparator);
    }
    // Returns null if the patient cannot be added; otherwise, returns the identifier of the patient in the emergency ward.
    public String addPatient(Patient patient, SeverityCode severity) {
        //Adds patient if not already in the queue
        if(!needToBeVisited.contains(patient) && !inVisiting.contains(patient)) {
            WaitingPatient waitingPatient = new WaitingPatient(patient,severity);
            needToBeVisited.push(waitingPatient,severity);
            return waitingPatient.getWaitingPatientIdentifier();
        }
        return null;
    }

    //Remove patient from the emergency ward
    public boolean removePatient(Patient patient) {
        if(needToBeVisited.contains(patient)) {
            needToBeVisited.pop(patient);
            return true;
        }else if(inVisiting.contains(patient)) {
            inVisiting.pop(patient);
            return true;
        }else{
            return false;
        }
    }

    public boolean callPatient(Patient patient,String ambulatory) {
        if(needToBeVisited.contains(patient)) {
            WaitingPatient wp = needToBeVisited.pop(patient);
            inVisiting.push(wp,wp.getSeverityCode());
            lastPatientsCalled.addFirst(new CalledPatient(wp,ambulatory));
            return true;
        }else if(inVisiting.contains(patient)) {
            WaitingPatient wp = inVisiting.peek(patient);
            lastPatientsCalled.addFirst(new CalledPatient(wp,ambulatory));
            return true;
        }else{
            return false;
        }
    }

    public Map<SeverityCode,Long> getNeedToBeVisitedStatus(){
        return needToBeVisited.getSizeOfQueues();
    }

    public Map<SeverityCode,Long> getInVisitingStatus(){
        return inVisiting.getSizeOfQueues();
    }

    public Map<SeverityCode, List<WaitingPatient>> getNeedToBeVisitedQueue(){
        return needToBeVisited.getAllQueues();
    }

    public Map<SeverityCode, List<WaitingPatient>> getInVisitingQueue(){
        return inVisiting.getAllQueues();
    }

    public List<CalledPatient> getCalledPatients(){
        return lastPatientsCalled.stream().toList();
    }
}
