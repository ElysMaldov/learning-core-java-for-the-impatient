Here is a program:

    public class SequenceDemo {
        public static void main(String[] args) {
            DigitSequence seq = IntSequence.digits(1729); // static method
            System.out.println(seq.next());
            System.out.println(seq.rest());        
        }
    }
    
Or, if you prefer to use jshell:

    javac ch03/sec02/*.java
    jshell
    var seq = IntSequence.digits(1729);
    seq.next()
    seq.rest()

If you haven't done so, give jshell a try. It is great for explorations such as this one.
