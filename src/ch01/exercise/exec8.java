package ch01.exercise;

import java.util.Scanner;

public class exec8 {
    public static void main(String[] args) {
        System.out.println("Put strings");
        var in = new Scanner(System.in);

        String userInput = in.nextLine();

        var splittedInput = userInput.split(" ");

        for (String word : splittedInput) {
            System.out.println(word);
        }

    }
}
