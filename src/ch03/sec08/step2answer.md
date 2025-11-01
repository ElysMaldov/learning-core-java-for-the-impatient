1. In `comparing(f, g)`, f is a key extractor and g is a comparator. With `comparing(f).thenComparing(g)`, both f and g are comparators. 

2. ```
   Arrays.sort(people, Comparator.comparing(Person::name, 
        Comparator.comparingInt(String::length));
   ```
   
3. ```
   Arrays.sort(people, Comparator.comparing(Person::name).reversed());
   ```

