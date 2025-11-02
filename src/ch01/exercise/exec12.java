package ch01.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exec12 {
    public static void main(String[] args) {
        System.out.println("Put N, S, E, W");
        var in = new Scanner(System.in);

        String userInput = in.nextLine();

        int[] offset = switch (userInput) {
            case "N" -> new int[]{0, 1};
            case "S" -> new int[]{0, -1};
            case "E" -> new int[]{1, 0};
            case "W" -> new int[]{-1, 0};
            default -> throw new IllegalArgumentException();
        };

        System.out.println(Arrays.toString(offset));
    }
}
