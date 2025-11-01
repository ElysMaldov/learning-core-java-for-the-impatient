Here is the demo class:

    public class RangeDemo {
        public static void show(IntSequence seq) {
            while (seq.hasNext()) System.out.print(seq.next() + " ");
            System.out.println();             
        }
        public static void main(String[] args) {
            show(IntSequence.until(0, 10));
            show(IntSequence.to(0, 10));
            show(IntSequence.downTo(10, 0));
        }
    }
    
Here is a possible implementation of the `RangeSequence` class that takes advantage of the fact that `increment` is always ±1:

    public class RangeSequence implements IntSequence {
        private int current;
        private int stop;
        private int increment;
        
        public RangeSequence(int start, int stop, int increment) {
            current = start - increment;
            this.stop = stop;
            this.increment = increment;
        }
        public boolean hasNext() {
            return current + increment != stop;
        }
        public int next() {
            current += increment;
            return current;
        }        
    }
