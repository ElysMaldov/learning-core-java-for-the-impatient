Here is one solution:

    public static double middle(int[] values) {
        int n = values.length;
        return StaticMethodDemo.average(values[n / 2], values[n - 1 - n / 2]);
    }

It is also ok to test for `n % 2 == 0`.

The important part of this exercise is how the `average` method is called. The method belongs to the `StaticMethodDemo` class. Unlike instance methods, it is not invoked on an object.