The book code has a nice example for producing pictures from functions (int, int) -> Color. Unfortunately, we can't do that in the online environment. Instead, declare a functional interface for creating a Unicode character from the coordinates:

    @FunctionalInterface
    public interface CharFunction {
        String apply(int x, int y);
    }

Then make a demo that prints a flag of your choice, such as


    @@@@@     #####
    @@@@@     #####
    @@@@@     #####
    @@@@@     #####
    @@@@@     #####

