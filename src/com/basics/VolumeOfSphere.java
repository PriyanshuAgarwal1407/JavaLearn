package com.basics;

import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = sc.nextDouble();

        // Use 4.0 / 3.0 to ensure floating-point division
        // double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        // Using Math.pow() for the cube calculation
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Radius: " + radius);
        System.out.printf("Volume of the sphere is: %.5f\n", volume);

        sc.close();
    }
}

/*
Enter a radius: 10.5
Radius: 10.5
Volume of the sphere is: 4849.04826
 */
