package ch01.exercise;

import java.math.BigInteger;

public class exec6 {
    public static void main(String[] args) {
        int factorial = 1_000;
        var result = BigInteger.valueOf(factorial);

        for (int i = factorial - 1; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
