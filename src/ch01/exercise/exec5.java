package ch01.exercise;

public class exec5 {
    public static void main(String[] args) {
        double largerstIntPlusOneToDouble = (double) (Integer.MAX_VALUE + 1);
        int largerThanLargest = (int) largerstIntPlusOneToDouble;

        System.out.printf("It overflows %d", largerThanLargest);
    }
}
