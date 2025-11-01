package ch04.sec05;

public class RecordPatternDemo {
    public static void main(String[] args) {
        // A record pattern
        record Point(double x, double y) {
        }
        Point p = new Point(Math.random(), Math.random());
        double slope = switch (p) {
            case Point(var a, var b) -> b / a;
        };
        System.out.printf("%s has slope %f%n", p, slope);

        // A nested record pattern
        record Circle(Point center, double radius) {
        }
        Circle c = new Circle(p, Math.random());
        switch (c) {
            case Circle(Point(var a, var b), var r) -> System.out.printf(
                    "A circle with center (%f, %f) and radius %f%n", a, b, r);
        }
        
        // A guard
        p = new Point(0.5, 0);
        String description = switch (p)
           {
              case Point(var x, var y) when x == 0 && y == 0 -> "origin";
              case Point(var x, var __) when x == 0 -> "on x-axis";
              case Point(var __, var y) when y == 0 -> "on y-axis";
              default -> "not on either axis";
           };
        System.out.println(description);
        
        // Null handling for nested boxes
        record Box<T>(T contents) { }

        Box<Box<String>> doubleBoxed = new Box<>(null);
        String unboxed = switch (doubleBoxed) {
            case Box(Box(String s)) -> s;
        };
    }
}
