
package com.electricity;

public class ElectricityBill {

    private static final double FIXED_CHARGE = 50.0;

    public double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative"
            );
        }

        double charge = 0;

        if (units <= 100) {
            charge = units * 1.50;
        }
        else if (units <= 200) {
            charge = (100 * 1.50)
                   + (units - 100) * 2.50;
        }
        else {
            charge = (100 * 1.50)
                   + (100 * 2.50)
                   + (units - 200) * 4.00;
        }

        return charge + FIXED_CHARGE;
    }
}
