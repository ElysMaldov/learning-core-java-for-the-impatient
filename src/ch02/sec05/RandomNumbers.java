package ch02.sec05;

import java.util.random.RandomGenerator;

public class RandomNumbers {
    private static RandomGenerator generator  = RandomGenerator.getDefault();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
            // Ok to access the static generator variable
    }
}