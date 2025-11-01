Add this method to the `MethodReferenceDemo` class or a jshell session:

    public static double[] map(double[] values, DoubleUnaryOperator op) {
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) 
            result[i] = op.applyAsDouble(values[i]);
        return result;
    }

Given this array:

    double[] values = { 0, 1, -2.25, -4, 6.25 };
    
call map to produce an array of the absolute values. Use a method expression.

Call map again to produce an array of the square roots, again with a method expression.

Finally, explain the result of 

    Double zero = Double.valueOf(0);
    map(values, zero::compareTo)

