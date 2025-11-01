Complete the `normalize` method in this program so that it prints the angle between 0 and 359 degrees.

```
package ch01.sec04;

public class Angle {
    public static int normalize(int angle) {
        return ...;
    }
    public static void main(String[] args) {
        System.out.println(normalize(400)); // Expected: 40
        System.out.println(normalize(200)); // Expected: 200
        System.out.println(normalize(-200)); // Expected: 160
    }
}
```
