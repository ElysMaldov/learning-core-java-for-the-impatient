The first element was used to initialize the `result` variable. But you can initialize it with -∞ instead. Then you don't need a special case for the first element.

    public static double max(double... values) {
        double result = Double.NEGATIVE_INFINITY;
        for (double v : values) result = Math.max(v, result);
        return result;
    }

It is true that max(a1, a2, ..., an) = Math.max(a1, max(a2, ..., an)). 

However, we don't want to allocate a new array in each recursive call. It is better to use a recursive helper function:

    private static double maxHelper(double[] values, int start) {
        if (start == values.length) return Double.NEGATIVE_INFINITY;
        else return Math.max(values[start], maxHelper(values, start + 1));
    }

    public static double max(double... values) { return maxHelper(values, 0); }

