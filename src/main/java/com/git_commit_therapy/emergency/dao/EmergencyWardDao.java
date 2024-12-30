package com.git_commit_therapy.emergency.dao;

import com.git_commit_therapy.emergency.model.WaitingPatient;
import com.git_commit_therapy.emergency.utils.WaitingQueue;
import com.git_commit_therapy.employeeService.dao.Patient;
import com.git_commit_therapy.employeeService.dao.SeverityCode;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class EmergencyWardDao {
    private WaitingQueue needToBeVisited = new WaitingQueue();
    private WaitingQueue inVisiting = new WaitingQueue();



    public EmergencyWardDao() {
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
        if(!needToBeVisited.contains(patient) || !inVisiting.contains(patient)) {
            WaitingPatient waitingPatient = new WaitingPatient(patient);
            needToBeVisited.push(waitingPatient,severity);
            return waitingPatient.getWaitingPatientIdentifier();
        }
        return null;
    }

}
