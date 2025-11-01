Run the `ForDemo` program to see how it adds up twenty random integers. Now change the loop to:

	for (int i = 1; i <= count; i++) {
		sum = sum + i;
	}

Then the program prints out the sum 1 + 2 + ... + 20. This value is called the 20th "triangle number", because it gives the number of asterisks in this triangle:

    *
    **
    ***
    ****
    ...
    (20 *s)

Change the program so that it prints out the first twenty triangle numbers.