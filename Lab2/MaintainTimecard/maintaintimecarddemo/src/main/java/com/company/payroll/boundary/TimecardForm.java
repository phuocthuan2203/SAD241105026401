package com.company.payroll.boundary;

import com.company.payroll.control.TimecardController;
import com.company.payroll.control.ProjectManagementDatabaseController;
import com.company.payroll.entity.Timecard;
import com.company.payroll.entity.TimecardEntry;
import com.company.payroll.entity.Employee;
import com.company.payroll.entity.ChargeNumber;
import java.util.List;

public class TimecardForm {
    private TimecardController timecardController;
    private ProjectManagementDatabaseController pmDatabaseController;
    private Timecard currentTimecard;

    public TimecardForm() {
        timecardController = new TimecardController();
        pmDatabaseController = new ProjectManagementDatabaseController();
    }

    public void displayTimecardForm(Employee employee) {
        // Retrieve or create timecard
        currentTimecard = timecardController.retrieveOrCreateTimecard(employee.getEmployeeId());
        // Display timecard details (placeholder)
        System.out.println("Displaying timecard for Employee: " + employee.getName());
    }

    public void captureHoursAndChargeNumbers() {
        // Placeholder for capturing user input
        // Simulate adding an entry
        List<ChargeNumber> availableChargeNumbers = pmDatabaseController.getAvailableChargeNumbers();
        // For demonstration, we'll select the first charge number
        ChargeNumber selectedChargeNumber = availableChargeNumbers.get(0);
        TimecardEntry entry = new TimecardEntry(/*date*/ null, selectedChargeNumber.getChargeNumberId(), 8.0);
        currentTimecard.addEntry(entry);
    }

    public void submitTimecard(Employee employee) {
        boolean success = timecardController.submitTimecard(currentTimecard, employee);
        if (success) {
            System.out.println("Timecard submitted successfully.");
        } else {
            System.out.println("Failed to submit timecard. Validation errors.");
        }
    }
}
