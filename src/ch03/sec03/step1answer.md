1. Indeed, `LocalDate` implements `Comparable`. Given an array

       LocalDate[] birthdays = { LocalDate.of(1955, 5, 19), 
           LocalDate.of(1815, 11, 2), LocalDate.of(1903, 6, 14) };

   call
   
       Arrays.sort(birthdays);
       System.out.println(Arrays.toString(birthdays));
       
2. Trying to sort

       Object[] systemThings = { System.in, System.out, System.err };
       
   compiles but a `ClassCastException` is thrown at runtime.
