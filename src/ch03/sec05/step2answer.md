The equivalent lambda expressions are:

* `name -> new Employee(name)`
* `length -> new Employee[](length)`

The first constructor reference is straightforward. We have a stream of strings. (A stream is a sequence of values with "lazy" evaluation, computing results only when they are needed.) The call to `map` yields a stream of `Employee` instances. Each string `name` is turned into `new Employee(name)`.

The second constructor reference is rather technical. The stream operations are declared in the generic `Stream<T>` interface. The `toArray` method needs to produce an array of type `T`. But it can't call `new T[length]` because one can't construct an array of an unknown type in Java. Therefore, it uses the passed-in constructor reference that allows it to construct an array of the correct type.
