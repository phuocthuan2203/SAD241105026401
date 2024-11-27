package com.company.payroll;

import com.company.payroll.boundary.TimecardForm;
import com.company.payroll.entity.Employee;

public class Main {
    public static void main(String[] args) {
        // Create a demo employee
        Employee employee = new Employee("E001", "John Doe", 40);

        // Create and display the timecard form
        TimecardForm timecardForm = new TimecardForm();
        timecardForm.displayTimecardForm(employee);

        // Capture hours and charge numbers
        timecardForm.captureHoursAndChargeNumbers();

        // Submit the timecard
        timecardForm.submitTimecard(employee);
    }
}
