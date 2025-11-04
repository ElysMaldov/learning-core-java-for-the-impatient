package ch01.exercise;

public class exec21 {
    public static void main(String[] args) {
        System.out.println(average(1, 1));
    }

    public static double average(double val1, double... values) {
        double sum = val1;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / (values.length + 1);
    }
}
