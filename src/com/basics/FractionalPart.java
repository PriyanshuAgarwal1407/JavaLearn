package com.basics;

import java.util.Scanner;
public class FractionalPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Extract integer part and calculate fractional part
        long whole = (long) number;
        double fractional = Math.abs(number - whole);

        System.out.printf("Fractional part: %.3f\n", fractional);

        scanner.close();
    }
}

/*
Enter a floating-point number: 12.345
Fractional part: 0.345

Enter a floating-point number: -5.75
Fractional part: 0.750
 */