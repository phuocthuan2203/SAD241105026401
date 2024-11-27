package com.company.payroll.entity;

import java.util.Date;

public class TimecardEntry {
    private Date date;
    private String chargeNumber;
    private double hoursWorked;

    public TimecardEntry(Date date, String chargeNumber, double hoursWorked) {
        this.date = date;
        this.chargeNumber = chargeNumber;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public Date getDate() {
        return date;
    }

    public String getChargeNumber() {
        return chargeNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public boolean validateHours() {
        // Placeholder for validation logic
        return hoursWorked >= 0 && hoursWorked <= 24;
    }
}
