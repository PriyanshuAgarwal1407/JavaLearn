package com.basics;

import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Formula: Celsius = (Fahrenheit - 32) × 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in Celsius is: %.2f\n", celsius);

        sc.close();
    }
}

/*
Enter temperature in Fahrenheit: 98.6
Temperature in Celsius is: 37.00
 */
