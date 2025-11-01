You could do this with `%`, but then you have to do something special for negative angles. The easy way is:

```
    public static int normalize(int angle) {
        return Math.floorMod(angle, 360);
    }
```
