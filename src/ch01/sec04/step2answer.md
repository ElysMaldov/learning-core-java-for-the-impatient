Observe that the second condition

```
s + (100 - s) / n < 50
```

contains a division by zero. If it is executed, when `n` is zero, the program terminates with an exception. You can try that out by adding the statement

```
System.out.println(s + (100 - s) / n < 50);
```

after the statement 

```
n = 0;
```

Short circuit evaluation means that the second operand of `&&` is only evaluated if the first operand is `true`. In particular, in the condition 

```
n != 0 && s + (100 - s) / n < 50
```

the second operand is not evaluated when `n` is zero, so no exception occurs. 

The `||` operator behaves in a similar way. The second operand is skipped if the first one is `true`. When `n` is zero, then

```
n == 0 || s + (1 - s) / n >= 50
```

evaluates to `true` without trying to compute the second expression (which would throw an exception).
