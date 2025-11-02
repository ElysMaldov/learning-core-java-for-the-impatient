package ch01.exercise;

import java.util.Scanner;

public class exec11 {
    public static void main(String[] args) {
        System.out.println("Put strings");
        var in = new Scanner(System.in);

        String userInput = in.nextLine();

        var userInputChar = userInput.toCharArray();

        for (char n : userInputChar) {
            // ASCII is in range 0 - 127
            var isASCII = n < 128;

            if (!isASCII) {
                System.out.printf("%c is not ASCII with value %s", n, Integer.toHexString(n));
                System.out.println();
            } else {
                System.out.printf("%c is ASCII", n);
                System.out.println();
            }
        }
    }
}
