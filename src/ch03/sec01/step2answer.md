Here is one possible implementation of the class:

    class BlinkSequence implements IntSequence {
        private int current = 0;
        public boolean hasNext() { return true; }
        public int next() { current = 1 - current; return current; } 
    }

There are many ways of "flipping" the current state, all valid. The important part is that you first generate a 1.

Add this call to `IntSequenceDemo`:

    System.out.println(average(new BlinkSequence(), 99));
