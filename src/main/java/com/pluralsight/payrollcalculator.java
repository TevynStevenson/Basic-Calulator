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

        //Change scanner to Double
        double hoursWorked = payrollCalculator.nextDouble();

        // Ask user to enter their pay rate
        System.out.println("What is your pay rate");
        double payRate = payrollCalculator.nextDouble();

        //Print employees name and payrate
        System.out.println(name + "'" + "s" + ' ' + "Total Gross Pay" + ' ' + "=" + ' ' + "$" + hoursWorked * payRate);

        //Add if statement
        if (hoursWorked > 40) {
            System.out.println(name + "Has Qualified For Overtime" + """
                    Overtime Pay = Gross Pay * 1.5""");
            System.out.println(name + "'" + "s" + ' ' + "Total Gross Pay" + ' ' + "=" + ' ' + "$" + hoursWorked * payRate * 1.5);
        }

    }}