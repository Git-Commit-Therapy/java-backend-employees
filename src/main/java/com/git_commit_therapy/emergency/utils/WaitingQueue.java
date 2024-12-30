package com.git_commit_therapy.emergency.utils;

import com.git_commit_therapy.emergency.model.WaitingPatient;
import com.git_commit_therapy.employeeService.dao.Patient;
import com.git_commit_therapy.employeeService.dao.SeverityCode;

import java.util.*;

public class WaitingQueue implements MultipleQueue<WaitingPatient, SeverityCode> {

    private final Map<SeverityCode, List<WaitingPatient>> queues;
    private Comparator<WaitingPatient> comparator;

    public WaitingQueue() {
        this.queues = new HashMap<>();
        //Create the queues
        queues.put(SeverityCode.WHITE, new ArrayList<>());
        queues.put(SeverityCode.GREEN, new ArrayList<>());
        queues.put(SeverityCode.YELLOW, new ArrayList<>());
        queues.put(SeverityCode.ORANGE, new ArrayList<>());
        queues.put(SeverityCode.RED, new ArrayList<>());
        comparator = null;
    }


    public WaitingQueue(Comparator<WaitingPatient> comparator) {
        this();
        this.comparator = comparator;
    }

    @Override
    public void push(WaitingPatient item, SeverityCode queueToken) {
        queues.get(queueToken).add(item);
        if (comparator != null) {
            queues.get(queueToken).sort(comparator);
        }
    }

    public void push(Patient item, SeverityCode queueToken) {
        this.push(new WaitingPatient(item), queueToken);
    }

    @Override
    public WaitingPatient pop(WaitingPatient item) {
        WaitingPatient p = null;
        for (List<WaitingPatient> queue : queues.values()) {
            if (queue.contains(item)) {
                p = item;
                queue.remove(item);
                if (comparator != null) {
                    queue.sort(comparator);
                }
                break;
            }
        }
        return p;
    }

    public Patient pop(Patient patient) {
        WaitingPatient p = this.pop(new WaitingPatient(patient));
        return (p != null) ? p.getPatient() : null;
    }

    @Override
    public Map<SeverityCode, List<WaitingPatient>> getAllQueues() {
        return Collections.unmodifiableMap(queues);
    }

    @Override
    public List<WaitingPatient> getQueue(SeverityCode queueToken) {
        return Collections.unmodifiableList(queues.get(queueToken));
    }

    @Override
    public void setComparator(Comparator<WaitingPatient> comparator) {
        this.comparator = comparator;
        for (List<WaitingPatient> queue : queues.values()) {
            queue.sort(comparator);
        }
    }

    @Override
    public boolean contains(WaitingPatient item) {
        for (List<WaitingPatient> queue : queues.values()) {
            if (queue.contains(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<SeverityCode, Long> getSizeOfQueues() {
        Map<SeverityCode, Long> map = new HashMap<>();
        for (SeverityCode sc : queues.keySet()) {
            map.put(sc, (long) queues.get(sc).size());
        }
        return map;
    }

    public boolean contains(Patient patient) {
        return this.contains(new WaitingPatient(patient));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("WaitingQueue{");
        for (SeverityCode sc : queues.keySet()) {
            result.append("\n\t").append(sc.toString()).append(":").append(queues.get(sc).toString());
        }
        return result + "\n}";
    }
}
