package com.company.payroll.control;

import com.company.payroll.entity.ChargeNumber;
import java.util.ArrayList;
import java.util.List;

public class ProjectManagementDatabaseController {
    public List<ChargeNumber> getAvailableChargeNumbers() {
        // Placeholder to simulate fetching charge numbers
        List<ChargeNumber> chargeNumbers = new ArrayList<>();
        chargeNumbers.add(new ChargeNumber("CN001", "Project Alpha"));
        chargeNumbers.add(new ChargeNumber("CN002", "Project Beta"));
        return chargeNumbers;
    }
}
