If the given loop produces one triangle number, you can use two nested loops to print many triangle numbers:

for (int c = 1; c <= count; c++) {
    int sum = 0;
	for (int i = 1; i <= count; i++) {
		sum = sum + i;
	}
    System.out.println("Triangle number " + c + " is " + sum);
}

But in this case, a single loop suffices:

	int sum = 0;
    for (int i = 1; i <= count; i++) {
		sum = sum + i;
        System.out.println("Triangle number " + i + " is " + sum);
	}
    