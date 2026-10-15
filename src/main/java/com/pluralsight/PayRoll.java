package com.pluralsight;
    import java.util.Scanner;
public class PayRoll {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = myScanner.nextLine();

        System.out.print("How many hours do you work? ");
        double hoursWorked = myScanner.nextDouble();

        System.out.print("What is your pay rate? ");
        double payRate = myScanner.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Hello, " + userName + "!");
        System.out.println("Your gross pay is: $" + grossPay);


    }
}
