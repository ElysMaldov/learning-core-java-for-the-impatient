package ch01.exercise;

import java.util.Scanner;

public class exec7 {
    public static void main(String[] args) {
        System.out.println("Put 2 integers");
        var in = new Scanner(System.in);

        if (!in.hasNextInt()) {
            System.out.println("Must be an integer");
            System.exit(1);
        }
        final int first = in.nextInt();

        if (!in.hasNextInt()) {
            System.out.println("Must be an integer");
            System.exit(1);
        }
        final int second = in.nextInt();

        var resSum = Integer.toUnsignedString(Math.addExact(first, second));
        var resDiff = Integer.toUnsignedString(Math.subtractExact(first, second));
        var resQuotient = Integer.toUnsignedString(Math.divideExact(first, second));
        var resRemainder = Integer.toUnsignedString(Math.floorMod(first, second));

        System.out.println(resSum);
        System.out.println(resDiff);
        System.out.println(resQuotient);
        System.out.println(resRemainder);
    }
}

/*
* Correct code
* package ch01.exercise;

import java.util.Scanner;

public class exec7 {
    public static void main(String[] args) {
        System.out.println("Put 2 unsigned integers (0 to 4294967295):");
        Scanner in = new Scanner(System.in);

        int first;
        int second;

        // 1. Read input as strings and parse as unsigned integers
        try {
            if (!in.hasNext()) {
                System.out.println("Error: No input provided.");
                System.exit(1);
            }
            String firstInput = in.next();
            // This correctly parses "4000000000" and stores its bit pattern in an int
            first = Integer.parseUnsignedInt(firstInput);

            if (!in.hasNext()) {
                System.out.println("Error: Second integer not provided.");
                System.exit(1);
            }
            String secondInput = in.next();
            second = Integer.parseUnsignedInt(secondInput);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid unsigned integer in the allowed range.");
            System.exit(1);
            return; // Exit
        }

        // 2. Perform unsigned arithmetic

        // Sum, Difference, and Product use standard operators
        int sum = first + second;
        int diff = first - second;
        int product = first * second;

        // Handle division by zero
        if (second == 0) {
            System.out.println("Sum: " + Integer.toUnsignedString(sum));
            System.out.println("Difference: " + Integer.toUnsignedString(diff));
            System.out.println("Product: " + Integer.toUnsignedString(product));
            System.out.println("Quotient: Error (division by zero)");
            System.out.println("Remainder: Error (division by zero)");
            System.exit(0);
        }

        // Quotient and Remainder MUST use the specific unsigned methods
        int quotient = Integer.divideUnsigned(first, second);
        int remainder = Integer.remainderUnsigned(first, second);

        // 3. Print results using toUnsignedString to interpret the bits correctly
        System.out.println("Sum: " + Integer.toUnsignedString(sum));
        System.out.println("Difference: " + Integer.toUnsignedString(diff));
        System.out.println("Product: " + Integer.toUnsignedString(product));
        System.out.println("Quotient: " + Integer.toUnsignedString(quotient));
        System.out.println("Remainder: " + Integer.toUnsignedString(remainder));
    }
}
* */