Surely for any string `s`, the expression `s.equalsIgnoreCase(s.toUpperCase())` is `true`. Or is it?

Start JShell in the terminal:

```{execute}
jshell
```

Compute the uppercase of the german word Straße (street). The answer may surprise you, but that is what German speakers actually write. There is no uppercase version of the "latin small letter sharp s" (ß). 

What happens when you lowercase the result? 

What happens when you compare the original and the result with `equalsIgnoreCase`? Why? (Hint: Read the JavaDoc)
