package ch01.exercise;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        System.out.println("Put an integer");
        var in = new Scanner(System.in);

        if (in.hasNextInt()) {
            var inputInteger = in.nextInt();

            System.out.printf("Binary %h",
                              Integer.toBinaryString(inputInteger));
            System.out.println();
            System.out.printf("Octal %h", Integer.toOctalString(inputInteger));
            System.out.println();
            System.out.printf("Hexadecimal %h",
                              Integer.toHexString(inputInteger));
        } else {
            System.out.println("Must be an integer");
        }
    }
}
