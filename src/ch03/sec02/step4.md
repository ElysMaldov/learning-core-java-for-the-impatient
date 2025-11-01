Add these methods to the `IntSequence` class:

    static IntSequence until(int start, int end) { return range(start, end, 1); }
    static IntSequence to(int start, int end) { return range(start, end + 1, 1); }
    static IntSequence downTo(int start, int end) { return range(start, end - 1, -1); }
    
Also add a private method

    private static IntSequence range(int start, int stop, int increment) {
        return new RangeSequence(start, stop, increment);
    }

Provide a suitable class `RangeSequence` and a demo class.
