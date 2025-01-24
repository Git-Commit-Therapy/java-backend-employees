package com.git_commit_therapy.emergency.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class CalledPatient extends WaitingPatient{
    protected String ambulatory;
    protected Date calledTime;
    public CalledPatient(WaitingPatient wp,String ambulatory) {
        super(wp.getPatient(), wp.severityCode,wp.getTriageEntry());
        this.ambulatory = ambulatory;
        this.calledTime = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WaitingPatient wp = (WaitingPatient) o;
        return super.equals(wp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ambulatory);
    }
}
