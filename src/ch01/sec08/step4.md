In Java, a two-dimensional array is an array of rows, where each row is an array. 

Run the `TwoDimensionalArrayDemo` program. 

Look at the output of the first array and see how the rows are switched. Look at the code that accomplishes this.

The program has two ways of printing the output of the triangular array ("Pascal's triangle"). The traditional approach uses indexes `[r][c]`. The version with the enhanced `for` loops doesn't. 

Now back to the first array. Those numbers are not random. This is the magic square from Dürer's famous engraving "Melencolia". The sums of the rows, columns, and diagonals are the same. 

Write nested loops that print the sums of the rows. Repeat for the columns. And print the sums of the diagonals. (Do this before swapping the rows--otherwise the diagonal sums won't be right.) 

Which of your loops can be enhanced `for` loops?