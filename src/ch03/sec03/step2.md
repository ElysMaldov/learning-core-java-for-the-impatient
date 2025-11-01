The class `java.awt.Point` does not implement the `Comparable` interface. Sort the array

    Point[] spiralPoints = { new Point(0, 0), new Point(1, 0), new Point(1, 1),
        new Point(0, 1), new Point(-1, 1), new Point(-1, 0), new Point(-1, -1),
        new Point(0, -1), new Point(1, -1), new Point(2, -1), new Point(2, 0) };
        
using an appropriate `Comparator<Point>`. Compare points by distance from the origin. Hint: Compare `Math.hypot(p.x, p.y)` and `Math.hypot(q.x, q.y)`. (The coordinates are public fields!)
