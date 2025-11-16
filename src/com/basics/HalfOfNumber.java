package com.basics;

import java.util.Scanner;
public class HalfOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("\n=== Different Ways to Calculate Half of " + num + " ===");

        // 1. Integer division (truncates decimal part)
        int integerHalf = num / 2;
        System.out.println("1. Integer division (num / 2): " + integerHalf);

        // 2. Using float literal
        float halfFloat1 = num / 2.0f;
        System.out.printf("2. Using float literal (num / 2.0f): %.2f\n", halfFloat1);

        // 3. Using type casting to float
        float halfFloat2 = (float) num / 2;
        System.out.printf("3. Using type casting ((float)num / 2): %.2f\n", halfFloat2);

        // 4. Using double literal
        double halfDouble1 = num / 2.0;
        System.out.printf("4. Using double literal (num / 2.0): %.2f\n", halfDouble1);

        // 5. Using type casting to double
        double halfDouble2 = (double) num / 2;
        System.out.printf("5. Using type casting ((double)num / 2): %.2f\n", halfDouble2);

        // 6. Using explicit float division
        float halfFloat3 = num / 2f;
        System.out.printf("6. Using explicit float (num / 2f): %.2f\n", halfFloat3);

        // 7. Using modulus to show remainder
        int remainder = num % 2;
        System.out.println("7. Remainder when divided by 2: " + remainder);

        // 8. Advanced: Handle both even and odd numbers
        if (num % 2 == 0) {
            System.out.println("8. The number is even, half is exactly: " + (num / 2));
        } else {
            System.out.printf("8. The number is odd, half is approximately: %.2f\n", (float) num / 2);
        }

        System.out.println("\n=== Key Points ===");
        System.out.println("- Integer division (num/2) truncates the decimal part");
        System.out.println("- Floating-point division preserves decimal precision");
        System.out.println("- Use 2.0, 2.0f, or type casting to get decimal results");

        scanner.close();
    }
}

/*
Enter an integer: 10

=== Different Ways to Calculate Half of 10 ===
1. Integer division (num / 2): 5
2. Using float literal (num / 2.0f): 5.00
3. Using type casting ((float)num / 2): 5.00
4. Using double literal (num / 2.0): 5.00
5. Using type casting ((double)num / 2): 5.00
6. Using explicit float (num / 2f): 5.00
7. Remainder when divided by 2: 0
8. The number is even, half is exactly: 5

=== Key Points ===
- Integer division (num/2) truncates the decimal part
- Floating-point division preserves decimal precision
- Use 2.0, 2.0f, or type casting to get decimal results
 */