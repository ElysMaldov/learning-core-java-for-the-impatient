You can form the row sums with enhanced for loops:

    for (int[] row : square) {
        int sum = 0;
        for (int e : row) sum += e;
        System.out.println(sum);
    }

But it doesn't work for the column sums. The inner loop needs to traverse multiple rows.

    for (int j = 0; j < square[0].length; j++) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) sum += square[i][j];
        System.out.println(sum);
    }

That is also the case for the diagonals:

    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < square.length; i++) {
        sum1 += square[i][i];
        sum2 += square[i][square.length - 1 - i];
    }
    System.out.printf("%d %d\n", sum1, sum2);