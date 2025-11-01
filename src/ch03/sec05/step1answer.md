Calling

    map(values, Math::abs)
    
yields an array of the absolute values. Now let's apply the square root:

    map(map(values, Math::abs), Math::sqrt)
    
In JShell, you can simply evaluate this expression. In a Java program, you have to work a bit harder:

    System.out.println(Arrays.toString(map(map(values, Math::abs), Math::sqrt)));

Finally,

    Double zero = Double.valueOf(0);
    map(values, zero::compareTo)

yields an array of 0, 1, or -1, depending on whether the corresponding value is zero, positive, or negative. The method expression

    zero::compareTo
    
is equivalent to

    x -> zero.compareTo(x)    
