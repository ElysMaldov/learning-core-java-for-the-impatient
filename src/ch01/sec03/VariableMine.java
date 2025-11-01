package ch01.sec03;

import java.math.BigDecimal;
import java.math.BigInteger;

enum WeekDays {
    MONDAY, TUESDAY, WED, THU
}

public class VariableMine {

    public static final int DAYS_PER_WEEK = 7;

    public static void main(String[] args) {
        double x = 98.4284;

        long Longer = (short) x;

        BigInteger n = BigInteger.valueOf(876543210123456789L);


        System.out.println(BigDecimal.valueOf(2, 0)
                .subtract(BigDecimal.valueOf(17, 1))
                .add(BigDecimal.valueOf(20, 3))
                .add(BigDecimal.valueOf(20, 3))
                .add(BigDecimal.valueOf(20, 3))
                .add(BigDecimal.valueOf(20, 3))
                .add(BigDecimal.valueOf(20, 3))
                .add(BigDecimal.valueOf(20, 3)));
    }


}
