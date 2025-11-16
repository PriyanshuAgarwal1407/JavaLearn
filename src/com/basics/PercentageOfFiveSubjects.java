package com.basics;

// Calculate the percentage of 5 subjects

import java.util.Scanner;
public class PercentageOfFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subject1, subject2, subject3, subject4, subject5;

        System.out.print("Enter marks for Subject 1: ");
        subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        subject3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        subject4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        subject5 = sc.nextInt();

        // Calculate total marks
        int total = subject1 + subject2 + subject3 + subject4 + subject5;

        // Assuming each subject is out of 100, so total max marks = 500
        double percentage = (total / 500.0) * 100;

        // Output results
        System.out.println("\nTotal Marks = " + total + " out of 500");
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}

// Sample I/O
/*
Enter marks for Subject 1: 50
Enter marks for Subject 2: 67
Enter marks for Subject 3: 45
Enter marks for Subject 4: 24
Enter marks for Subject 5: 75

Total Marks = 261 out of 500
Percentage = 52.2%
 */