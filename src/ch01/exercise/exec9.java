package ch01.exercise;

public class exec9 {
    public static void main(String[] args) {
        /*The exercise wants me to make examples where I compute strings that look like
         * the same objects but they are different objects in memory*/

        // Using formatted string
        String ori1 = "This must be me";
        String formatted = "This must be %s".formatted("me");

        boolean ori1SameWord = formatted.equals(ori1);
        boolean ori1SameMemory = ori1 == formatted;

        System.out.println(ori1SameWord);
        System.out.println(ori1SameMemory);
    }
}
