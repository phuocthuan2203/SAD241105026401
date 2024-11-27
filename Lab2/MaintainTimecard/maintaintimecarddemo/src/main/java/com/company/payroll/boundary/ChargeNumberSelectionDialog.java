package com.company.payroll.boundary;

import com.company.payroll.entity.ChargeNumber;
import java.util.List;

public class ChargeNumberSelectionDialog {
    public void displayChargeNumbers(List<ChargeNumber> chargeNumbers) {
        // Placeholder to display charge numbers
        System.out.println("Available Charge Numbers:");
        for (ChargeNumber cn : chargeNumbers) {
            System.out.println(cn.getChargeNumberId() + " - " + cn.getProjectName());
        }
    }

    public ChargeNumber captureSelection() {
        // Placeholder for user selection
        // For demonstration, returning a dummy charge number
        return new ChargeNumber("CN001", "Project Alpha");
    }
}
