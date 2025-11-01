Have a look at the `RepeatDemo` class. The `repeat` methods are similar to `for` loops, but they have function arguments where a `for` loop would have a body.

But there isn't all that much we can do with them, other than print messages. Let's go to the next level and see how we can compute factorials. In each iteration, we need to transform an intermediate result (the product 1 * 2 * ... * (i - 1)) and, using the current index, turn it into the next result, intermediateResult * i

That means, we need to apply a function (int, int) -> int in each iteration. The appropriate interface in the API is

    public interface IntBinaryOperator {
        int applyAsInt(int left, int right);
    }
    
Provide

    public static int repeat(int n, int initial, IntBinaryOperator transform)
    
and call it to compute the factorial of 10.

