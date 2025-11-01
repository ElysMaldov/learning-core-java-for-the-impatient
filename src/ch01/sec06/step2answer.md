If you enter `41` as the result of the first prompt and your name as the result of the second prompt, the name won't be read in. 

Try the input `41.99` for the age, and an empty input for the name. Now the name is set to `.99`. That gives a clue. 

The `nextInt` method reads the digits of the next integer *and nothing more*. When the input is `41` followed by a newline, the newline *is not read* by `nextInt`. Instead, the subsequent call to `nextLine` reads whatever was left after the integer (which may be nothing), and then consumes the newline.

One remedy is to call `nextLine`, both after the call to `nextInt` and in the `else` branch. 

Another remedy is to read the age input as a string with `nextLine`, and to turn it into an `int` with `Integer.parseInt`. But then you need to find another way of determining whether the input is a valid integer. 