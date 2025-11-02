package ch01.exercise;

public class exec10 {
    public static void main(String[] args) {
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
        System.out.println(getRandomStringFromLong());
    }

    private static String getRandomStringFromLong() {
        Long randomLong = (long) (Math.random() * Long.MAX_VALUE);

        return Long.toString(randomLong, 36);
    }


}
