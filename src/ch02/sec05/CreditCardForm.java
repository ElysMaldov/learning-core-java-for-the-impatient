package ch02.sec05;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    public static final ArrayList<Integer> YEARS = new ArrayList<>();
    static {
        // Add the next twenty years to the array list
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++) {
            YEARS.add(i);
        }   
    }
   
    // ...
}
