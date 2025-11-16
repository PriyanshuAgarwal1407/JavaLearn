package com.basics;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Please enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Now, enter the rate of interest: ");
        rate = scanner.nextDouble();

        System.out.print("Now, enter the time period in years: ");
        time = scanner.nextDouble();

        // Calculate amount (P * [(1 + R/100)^T]) and compound interest
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        // Format for currency output
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("\n--- Calculation Results ---");
        System.out.println("Principal Amount: ₹" + df.format(principal));
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Total Amount: ₹" + df.format(amount));
        System.out.println("Compound Interest: ₹" + df.format(compoundInterest));

        scanner.close();
    }
}

/*
Please enter the principal amount: 10000
Now, enter the rate of interest: 5
Now, enter the time period in years: 3

--- Calculation Results ---
Principal Amount: ₹10,000.00
Rate of Interest: 5.0%
Time Period: 3.0 years
Total Amount: ₹11,576.25
Compound Interest: ₹1,576.25
 */