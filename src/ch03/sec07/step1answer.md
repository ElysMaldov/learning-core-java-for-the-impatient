First lambda expression:

* `i` is local
* `count` and `text` are captured
* `System` is neither. It is imported (by the implicit import of the `java.lang` package)

Second lambda expression:

* `a` is captured. (Note that it is effectively final.)
* `System`—see above
