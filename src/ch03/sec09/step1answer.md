The `IntSequence` interface has *two* abstract methods, so you can't simply convert a lambda expression to an `IntSequence` instance.

If you define `hasNext` as a default method, then `IntSequence` only has a single abstract method, and you can define

    IntSequence s = () -> 42;

with a lambda expression.
