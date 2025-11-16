package com.basics;

import java.util.Scanner;
public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = sc.nextDouble();

        double circumference  = 2 * Math.PI * radius;

        System.out.println("Circumference of Circle = " + circumference );
        System.out.printf("Circumference of Circle = %.2f%n", circumference );

        sc.close();
    }
}

/*
Enter a radius: 10
Circumference of Circle = 62.83185307179586
Circumference of Circle = 62.83
 */