package ch01.sec09;

public class MyDecompose {
    public static void main(String[] args) {
        var greetingMsg = greet("Reyhan", 23);

        System.out.println(greetingMsg);

    }

    public static String greet(String name, int age) {
        return "Hello, %s. You are %d years old.".formatted(name, age);
    }
}
