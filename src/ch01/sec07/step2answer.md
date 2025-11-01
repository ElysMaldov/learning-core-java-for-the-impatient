Here is the loop:

	while (next != target) {
    	next = generator.nextInt(10);
		count++;
    }

However, `next` is not set until the first iteration. 

The remedy is to initalize `next` with any value that is different from `target`, so that the loop is entered at least once:

    int next = -1; // any value other than target will do