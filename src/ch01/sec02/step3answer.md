The statement

```
System.out.println('\u263A' + 1);
```

doesn't work. It prints a decimal integer. You could cast it as a character:

```
System.out.println((char)('\u263A' + 1));
```

Or you could do the addition in your head:

```
System.out.println('\u263B');
```

Either way, you get the BLACK SMILING FACE character ☻.
