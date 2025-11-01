With an import statement:

    package ch02.sec06;
    import ch02.sec05.RandomNumbers;

    public class DieTosses {
        public static void main(String[] args) {
            for (int i = 1; i <= 4; i++) {
                int dieToss = RandomNumbers.nextInt(1, 6);
                System.out.println(dieToss);
            }
        }
    }

With a wildcard import, you use

    import ch02.sec05.*;
    
instead. With no import, you call

    ch02.sec05.RandomNumbers.nextInt(1, 6);
