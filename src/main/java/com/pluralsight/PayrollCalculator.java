package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        // Created a scanner.
        Scanner myScanner = new Scanner(System.in);

        // Asked if the users name.
        System.out.print("What is your name? ");
        String userName = myScanner.nextLine();

        // Asked how many hours the user work.
        System.out.print("How many hours do you work? ");
        double hoursWorked = myScanner.nextDouble();

        // Asked about the user pay rate.
        System.out.print("What is your pay rate? ");
        double payRate = myScanner.nextDouble();

        // Calculate the users hours worked and pay rate.
        double grossPay = hoursWorked * payRate;

        // Printed the users name and gross pay.
        System.out.println("Hello, " + userName + "!");
        System.out.println("Your gross pay is: $" + grossPay);

        myScanner.close();

    }
}
