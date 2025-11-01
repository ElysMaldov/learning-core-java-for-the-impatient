```
record Line(Point from, Point to) {
    public double length() { return Point.distance(from, to); }
}
```
