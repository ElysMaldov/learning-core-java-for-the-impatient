package ch01.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exec13 {
    public static void main(String[] args) {
        System.out.println("Put N, S, E, W");
        var in = new Scanner(System.in);

        String userInput = in.nextLine();

        int[] coordinates = {0, 0};

        switch (userInput) {
            case "N" -> {
                coordinates[1] += 1;
            }
            case "S" -> {
                coordinates[1] -= 1;
            }
            case "E" -> {
                coordinates[0] += 1;
            }
            case "W" -> {
                coordinates[0] -= 1;
            }
            default -> throw new IllegalArgumentException();
        }
        ;

        System.out.println(Arrays.toString(coordinates));
    }
}
