package com.basics;

/*
  Program: Simple Interest Calculator
  -----------------------------------
  Formula: SI = (P × R × T) / 100
        Where:
            P = Principal amount
            R = Rate of interest (per annum)
            T = Time period (in years)
*/

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Interest Calculator ===");

        // Input principal amount
        System.out.print("Enter Principal Amount (₹): ");
        double principal = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter Rate of Interest (% per annum): ");
        double rate = scanner.nextDouble();

        // Input time period
        System.out.print("Enter Time Period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate total amount
        double totalAmount = principal + simpleInterest;

        // Display results
        System.out.println("\n=== Calculation Results ===");
        System.out.printf("Principal Amount: ₹%.2f\n", principal);
        System.out.printf("Rate of Interest: %.2f%% per annum\n", rate);
        System.out.printf("Time Period: %.2f years\n", time);
        System.out.println("-----------------------------");
        System.out.printf("Simple Interest: ₹%.2f\n", simpleInterest);
        System.out.printf("Total Amount: ₹%.2f\n", totalAmount);

        scanner.close();
    }
}

/*
=== Simple Interest Calculator ===
Enter Principal Amount (₹): 10000
Enter Rate of Interest (% per annum): 8.5
Enter Time Period (in years): 3

=== Calculation Results ===
Principal Amount: ₹10000.00
Rate of Interest: 8.50% per annum
Time Period: 3.00 years
-----------------------------
Simple Interest: ₹2550.00
Total Amount: ₹12550.00
 */