package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //import the scanner
        Scanner myScanner = new Scanner(System.in);


        //ask the user first number
        System.out.println("What is your first number");


        //store the answer from the user
        int firstNumber = myScanner.nextInt();

        //ask the user for the second number
        System.out.println("What is your second number");


        // store the answer for the second number
        int secondNumber = myScanner.nextInt();

        // pulls enter key press or the LF out of the buffer so it stops at the next readLine
        myScanner.nextLine();


        //ask the user what calculation theyre about to perform
        System.out.println("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option
                """);


        // multiply the first and second number and display the result
        String operation = myScanner.nextLine();

        //Answer the equation
        System.out.println("Your answer is" + ' ' + firstNumber * secondNumber);





    }
}
