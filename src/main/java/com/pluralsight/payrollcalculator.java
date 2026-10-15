package com.pluralsight;

import java.util.Scanner;

public class payrollcalculator {
    public static void main(String[] args) {

        //Import the scanner for the calculator
        Scanner payrollCalculator = new Scanner(System.in);

        // Ask user to enter their name
        System.out.printf("Enter your name");
        String name = payrollCalculator.nextLine();

        //Ask user to enter their hours worked
        System.out.println("How many hours have you worked");

        //Change scanner to Integer
        double hoursWorked = payrollCalculator.nextDouble();



    }
}
