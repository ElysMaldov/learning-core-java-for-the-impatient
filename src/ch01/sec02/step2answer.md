We see that 1.0 / 0.0 is +∞ and -1.0 / 0.0 is -∞, which is not surprising. These values can be written as `Double.POSITIVE_INFINITY` and `Double.NEGATIVE_INFINITY`. 

The division 0.0 / 0.0 yields the special value NaN ("not a number"). 

You can see that 1.0 equals `Double.POSITIVE_INFINITY` because `1.0 == Double.POSITIVE_INFINITY` prints `true`.

Surprisingly, even though 0.0 / 0.0 is NaN, and `Double.NaN` is NaN, the expression `1.0 == Double.NaN` prints `false`. There is a special rule for NaN. It is never equal to any value, not even itself. That seemed clever when the IEEE floating-point standard was invented, but it is actually a bit of a pain. 
