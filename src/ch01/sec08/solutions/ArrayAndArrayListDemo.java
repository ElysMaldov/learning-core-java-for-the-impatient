package ch01.sec08.solutions;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class ArrayAndArrayListDemo {
    public static void main(String[] args) {
        var generator = RandomGenerator.getDefault();
        String[] randomLetters = new String[10];
        var randomLetterList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            int r = generator.nextInt(26);
            String randomLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(r, r + 1);
            randomLetters[i] = randomLetter;
            randomLetterList.add(randomLetter);
        }        
        for (String s : randomLetters) System.out.print(s);
        System.out.println();
        for (String s : randomLetterList) System.out.print(s);
        System.out.println();
        for (int i = randomLetters.length - 1; i >= 0; i--)
            System.out.print(randomLetters[i]);
        System.out.println();
        for (int i = randomLetterList.size() - 1; i >= 0; i--)
            System.out.print(randomLetterList.get(i));
        System.out.println();
    }
}