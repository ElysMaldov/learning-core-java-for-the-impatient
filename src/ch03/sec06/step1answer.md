Here is the `repeat` method:

    public static int repeat(int n, int initial, IntBinaryOperator transform) {
        int v = initial;
        for (int i = 0; i < n; i++)
           v = transform.applyAsInt(v, i);
        return v;
    }

You call it like this:

    System.out.println(repeat(10, 1, (m, n) -> m * (n + 1)));

Don't forget the statement

    import java.util.function.IntBinaryOperator;
