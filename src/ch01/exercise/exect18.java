package ch01.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class exect18 {
    public static void main(String[] args) {
        var lotteries = new ArrayList<Integer>();
        for (int i = 1; i < 50; i++) {
            lotteries.add(i);
        }

        var results = new ArrayList<Integer>();

        while (results.size() < 6) {
            var randomIndex = (int) Math.floor(Math.random() * lotteries.size());

            var removedItem = lotteries.remove(randomIndex);

            results.add(removedItem);
        }

        Collections.sort(results);

        System.out.println(results);
    }
}
