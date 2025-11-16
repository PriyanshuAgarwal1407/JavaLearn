package com.basics;

import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("\n=== Calculation Results ===");
        System.out.printf("Radius: %.2f units\n", radius);
        System.out.printf("Height: %.2f units\n", height);
        System.out.printf("Volume: %.2f cubic units\n", volume);

        sc.close();
    }
}

/*
Enter the radius of the cylinder: 7
Enter the height of the cylinder: 15

=== Calculation Results ===
Radius: 7.00 units
Height: 15.00 units
Volume: 2309.07 cubic units
 */