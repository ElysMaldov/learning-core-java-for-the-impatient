The program uses:

* static methods `now` and `of` of `LocalDate`
* instance methods `getMonthValue`, `getDayOfWeek`, `getDayOfMonth`, `plusDays`

None of the instance methods are mutators. In fact, the `LocalDate` class is *immutable*. It has no mutator methods.

There are no constructor invocations. All instances are constructed with static methods.

The other classes used are:

* The `DayOfWeek` enumeration
* The `Integer` class, whose static `parseInt` method is called
* The `PrintStream` class whose `System.out` instance is used
