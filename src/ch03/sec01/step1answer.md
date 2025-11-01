1. No, then the call to `average(squares, 100)` would not compile. A `SquareSequence` is an `IntSequence` but not a `DigitSequence`.

2. The interface provides a type that is common to all sequences. Therefore, we can write methods (such as `average`) that work for objects of multiple classes.
