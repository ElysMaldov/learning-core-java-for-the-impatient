Here is the comparator class:

    class PointComparator implements Comparator<Point> {
        public int compare(Point p, Point q) {
            return Double.compare(Math.hypot(p.x, p.y), Math.hypot(q.x, q.y));
        }
    }
    
Sort the array:

    Arrays.sort(spiralPoints, new PointComparator());
