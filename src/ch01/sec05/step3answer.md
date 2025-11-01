The resulting string has an extra space at the beginning of every line.

This is the result of stripping the "common blank prefix". 

```
		html = """
              <div class="Warning">
                Beware of those who say "Hello" to the world
	          </div>
             """;
```

The first three lines are preceded by 14 spaces, but the line with the terminating `"""` only by 13 spaces. Therefore, 13 spaces are subtracted from all lines.

At least that's the hope. If the prefix contains a mixture of tabs and spaces, then the common prefix may be even shorter, depending on how they are distributed. Personally, I avoid this feature.
