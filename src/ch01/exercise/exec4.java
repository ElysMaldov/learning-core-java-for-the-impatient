package ch01.exercise;

public class exec4 {
    public static void main(String[] args) {
        System.out.printf("Largest positive double %f", Math.nextUp(Double.MAX_VALUE));
        System.out.println();
        System.out.printf("Smallest positive double %f", Math.nextDown(Double.MIN_VALUE));
    }
}
