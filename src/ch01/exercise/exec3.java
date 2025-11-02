package ch01.exercise;

import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        System.out.println("Put 3 integers");
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

        if (!in.hasNextInt()) {
            System.out.println("Must be an integer");
            System.exit(1);
        }
        final int third = in.nextInt();

        int largest = first;

        if (second > largest) largest = second;
        if (third > largest) largest = third;

        System.out.printf("Largest is %d", largest);

        int firstLargest = Math.max(first, second);
        int secondLargest = Math.max(firstLargest, third);

        System.out.println();
        System.out.printf("If using Math.max is %d", secondLargest);
    }
}
