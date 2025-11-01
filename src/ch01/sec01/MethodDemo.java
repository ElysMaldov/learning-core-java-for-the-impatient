package ch01.sec01;

import java.util.Random;
import java.util.random.RandomGenerator;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());

        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}