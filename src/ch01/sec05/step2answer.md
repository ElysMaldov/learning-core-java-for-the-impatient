The uppercase of `"Straße"` is `"STRASSE"`. But the lowercase of that doesn't recover the ß. It is simply `"strasse"`. 

The `equalsIgnoreCase` method does not take that subtlety into account. The JavaDoc simply states:

"Compares this String to another String, ignoring case considerations. Two strings are considered equal ignoring case if they are of the same length and corresponding Unicode code points in the two strings are equal ignoring case."

The two strings have different length, so they are not considered equal.

If you want to compare the strings intelligently, you have to use a harder-working class that knows about the German language. Paste this into JShell:

```
import java.text.*;
Collator collator = Collator.getInstance(Locale.GERMAN);
collator.setStrength(Collator.PRIMARY);
collator.compare("Straße", "STRASSE")
```

The result of zero shows that the two are equal.
