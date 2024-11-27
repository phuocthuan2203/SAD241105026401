package com.company.payroll.entity;

public class Employee {
    private String employeeId;
    private String name;
    private double hourLimit;

    public Employee(String employeeId, String name, double hourLimit) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourLimit = hourLimit;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHourLimit() {
        return hourLimit;
    }
}
