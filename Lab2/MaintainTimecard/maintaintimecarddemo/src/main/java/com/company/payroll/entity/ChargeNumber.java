package com.company.payroll.entity;

public class ChargeNumber {
    private String chargeNumberId;
    private String projectName;

    public ChargeNumber(String chargeNumberId, String projectName) {
        this.chargeNumberId = chargeNumberId;
        this.projectName = projectName;
    }

    // Getters and Setters
    public String getChargeNumberId() {
        return chargeNumberId;
    }

    public void setChargeNumberId(String chargeNumberId) {
        this.chargeNumberId = chargeNumberId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
