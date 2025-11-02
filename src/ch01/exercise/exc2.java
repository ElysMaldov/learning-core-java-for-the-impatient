package ch01.exercise;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        System.out.println("Put a signed integer");
        var in = new Scanner(System.in);

        if (in.hasNextInt()) {
            var integerAngle = in.nextInt();

            var normalizedModulo = integerAngle % 360;

            System.out.printf("Normalized modulo %d", normalizedModulo);

            var normalizedFloorMod = Math.floorMod(integerAngle, 360);

            System.out.println();
            System.out.printf("Normalized %d", normalizedFloorMod);
        } else {
            System.out.println("Must be an integer");
        }
    }
}
