
package com.electricity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElectricityBill bill = new ElectricityBill();

        System.out.print("Enter electricity units consumed: ");

        int units = sc.nextInt();

        try {
            double amount = bill.calculateBill(units);

            System.out.println("\nElectricity Bill");
            System.out.println("----------------------");
            System.out.println("Units Consumed: " + units);
            System.out.println("Fixed Charge: Rs. 50");
            System.out.println("Total Bill: Rs. " + amount);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
