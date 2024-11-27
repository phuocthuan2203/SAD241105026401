package com.company.payroll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Timecard {
    private String timecardId;
    private String employeeId;
    private Date startDate;
    private Date endDate;
    private List<TimecardEntry> entries;
    private String status; // e.g., "open", "submitted"
    private Date submittedDate;

    public Timecard(String timecardId, String employeeId, Date startDate, Date endDate) {
        this.timecardId = timecardId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.entries = new ArrayList<>();
        this.status = "open";
    }

    // Methods to manage entries
    public void addEntry(TimecardEntry entry) {
        entries.add(entry);
    }

    public void submit() {
        this.status = "submitted";
        this.submittedDate = new Date();
    }

    // Getters and Setters
    public String getTimecardId() {
        return timecardId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public List<TimecardEntry> getEntries() {
        return entries;
    }

    public String getStatus() {
        return status;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }
}
