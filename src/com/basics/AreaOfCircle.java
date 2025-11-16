package com.basics;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative. Please enter a valid radius.");
        } else {
            double area = Math.PI * radius * radius;
            System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area); // 2 decimal places
        }

        sc.close();
    }
}

/*
Enter the radius of the circle: 56.4
The area of the circle with radius 56.40 is: 9993.28
*/

