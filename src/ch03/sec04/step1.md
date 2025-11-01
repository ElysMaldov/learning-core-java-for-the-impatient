Run the `LambdaDemo` program. Then add another call to `removeIf` as follows.

First create an array list of all time zones known to Java:

    var tzs = new ArrayList<String>(List.of(TimeZone.getAvailableIDs()))

Most of the time zones have a continent and city, separated by a /, such as

    Asia/Ho_Chi_Minh
    Europe/Berlin

Remove all those, using a lambda expression, and print the rest. (Hint: Use the `contains` method of the `String` class.)

And while you are at it, sort the remainder by length, using `Collections.sort`.
