package com.git_commit_therapy.emergency.model;

import com.git_commit_therapy.employeeService.dao.Patient;
import com.git_commit_therapy.employeeService.dao.SeverityCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@Data
public class WaitingPatient {
    private Patient patient;
    private SeverityCode severityCode;
    private Date triageEntry;

    public WaitingPatient(Patient patient, SeverityCode severityCode) {
        this.patient = patient;
        this.severityCode = severityCode;
        triageEntry = new Date();
    }

    public Long getWaitingTime(){
        Date now = new Date();
        return now.getTime() - triageEntry.getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if(o instanceof Patient that){
            return patient.getPatientId().equals(that.getPatientId());
        }else{
            WaitingPatient that = (WaitingPatient) o;
            return patient.getPatientId().equals(that.patient.getPatientId());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient);
    }
    /*
        The code is created with this logic:
        DDD-CCC-HHHH
        Where:
        DDD: is the number of the day of the year
        CCC: are the first three letters of Patient ID (in italian: "Codice Fiscale")
        HHHH: hours and minutes in string format
     */
    public String getWaitingPatientIdentifier(){
        String identifier = "";
        // 1. DDD: Day of the year (1-365) based on triageEntry date
        SimpleDateFormat sdf = new SimpleDateFormat("D"); // 'D' gives the day of the year
        String dayOfYear = sdf.format(triageEntry); // Format as day of the year (1-365)

        // 2. CCC: First 3 characters of the "Codice Fiscale"
        String id = patient.getUser().getId();
        String idPrefix = id.length() >= 3 ? id.substring(0, 3) : id; // First 3 characters

        // 3. HHHH: Hour and Minute in string format
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm"); // Format for hour and minute
        String time = timeFormat.format(triageEntry); // Current time in HHmm format

        // Combine all parts: DDD-CCC-HHHH
        identifier = String.format("%03d-%s-%s", Integer.parseInt(dayOfYear), idPrefix, time);

        return identifier;
    }
}
