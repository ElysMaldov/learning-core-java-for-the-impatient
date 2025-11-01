package ch01.sec06;

import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.printf("Hello, %S", name);
    }
}
