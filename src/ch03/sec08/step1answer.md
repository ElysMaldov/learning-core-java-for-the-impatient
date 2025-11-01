Both methods yield a Comparator, which can be thought of as a function. The `compareInDirection` method creates a function from an `int`. The `reverse` method can be thought of transforming a function.

In functional programming, a higher order function is a function that produces or consumes a function (or both, as `reverse` does).

Here is the higher-order `repeat` method:

    public static Runnable repeat(int count, Runnable task) {
        return () -> {
            for (int i = 0; i < count; i++)
                task.run();
        };
    }
    
The code

    repeat(10, repeat(10, () -> System.out.println("Hello")))

yields a `Runnable` that, when run, prints 100 Hello messages. 
