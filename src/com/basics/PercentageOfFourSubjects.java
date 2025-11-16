package com.basics;
import java.util.Scanner;

public class PercentageOfFourSubjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_MARKS_PER_SUBJECT = 40;
        final int TOTAL_SUBJECTS = 4;
        final float TOTAL_MAX_MARKS = MAX_MARKS_PER_SUBJECT * TOTAL_SUBJECTS;

        System.out.println("=== Percentage Calculator ===");
        System.out.println("Each subject is out of " + MAX_MARKS_PER_SUBJECT + " marks");
        System.out.println("-----------------------------");

        System.out.print("Enter marks for Subject 1 (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        float s1 = scanner.nextFloat();

        System.out.print("Enter marks for Subject 2 (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        float s2 = scanner.nextFloat();

        System.out.print("Enter marks for Subject 3 (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        float s3 = scanner.nextFloat();

        System.out.print("Enter marks for Subject 4 (out of " + MAX_MARKS_PER_SUBJECT + "): ");
        float s4 = scanner.nextFloat();

        // Input validation
        if (s1 < 0 || s1 > MAX_MARKS_PER_SUBJECT ||
                s2 < 0 || s2 > MAX_MARKS_PER_SUBJECT ||
                s3 < 0 || s3 > MAX_MARKS_PER_SUBJECT ||
                s4 < 0 || s4 > MAX_MARKS_PER_SUBJECT) {
            System.out.println("Error: Marks must be between 0 and " + MAX_MARKS_PER_SUBJECT + "!");
            scanner.close();
            return;
        }

        float total = s1 + s2 + s3 + s4;
        float percentage = (total / TOTAL_MAX_MARKS) * 100;

        System.out.println("\n=== Results ===");
        System.out.printf("Subject 1: %.2f/%d\n", s1, MAX_MARKS_PER_SUBJECT);
        System.out.printf("Subject 2: %.2f/%d\n", s2, MAX_MARKS_PER_SUBJECT);
        System.out.printf("Subject 3: %.2f/%d\n", s3, MAX_MARKS_PER_SUBJECT);
        System.out.printf("Subject 4: %.2f/%d\n", s4, MAX_MARKS_PER_SUBJECT);
        System.out.println("-----------------------------");
        System.out.printf("Total Marks: %.2f/%.2f\n", total, TOTAL_MAX_MARKS);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}

/*
=== Percentage Calculator ===
Each subject is out of 40 marks
-----------------------------
Enter marks for Subject 1 (out of 40): 35
Enter marks for Subject 2 (out of 40): 38
Enter marks for Subject 3 (out of 40): 32
Enter marks for Subject 4 (out of 40): 36

=== Results ===
Subject 1: 35.00/40
Subject 2: 38.00/40
Subject 3: 32.00/40
Subject 4: 36.00/40
-----------------------------
Total Marks: 141.00/160.00
Percentage: 88.13%
*/