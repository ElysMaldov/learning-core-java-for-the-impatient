package ch08.sec12;

import java.util.BitSet;
import java.util.stream.IntStream;

public class CollectionDemo {
    public static void main(String[] args) {
        IntStream squares = IntStream.range(1, 100).map(n -> n * n);
        BitSet result = squares.collect(BitSet::new, BitSet::set, BitSet::or);
        System.out.println(result);
    }
}
