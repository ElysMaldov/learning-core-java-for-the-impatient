Have a look at the `ComparatorDemo` program.

1. What is the difference between `comparing(f, g)` and `comparing(f).thenComparing(g)`?

2. Rewrite 

       Arrays.sort(people, Comparator.comparing(Person::name,
                (s, t) -> s.length() - t.length()));

   so that it doesn't have a lambda expression. Use a method expression and another `Comparator` method.
   
3. Add an example that demonstrates `Comparator.reversed`.
