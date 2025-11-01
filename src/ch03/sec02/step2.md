Reimplement the `SquareSequence` from the preceding section:

    public class SquareSequence implements IntSequence {
        private int i;

        public boolean hasNext() {
            return true;
        }

        public int next() {
            i++;
            return i * i;
        }
    }
    
Take advantage of the default method in `IntSequence`.    
