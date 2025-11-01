Have a look at the `compareDirection` and `reverse` methods in the `HigherOrderDemo`. What are their parameter and return types? What makes them “higher order”?

Now add a higher-order method that modifies a `Runnable`, repeating it `n` times. For example,

    repeat(10, () -> System.out.println("Hello"))
    
should return a `Runnable` that, when run, prints ten Hello messages. What does

    repeat(10, repeat(10, () -> System.out.println("Hello")))
    
do?

