package ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrays {
    public static void main(String[] args) {
        String[] names = new String[100];

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            //names[i] = "";
        }

        int[] hours = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(hours);

        var minutes = new Boolean[]{false, true, true};

        System.out.println(minutes.length);
        System.out.println(Arrays.toString(minutes));

        var boyfriends = new ArrayList<String>(
                List.of("Meomwere", "Heavy", "Sometimes", "You are",
                        "With me"));

        boyfriends.add("meow");

        System.out.println(boyfriends.get(1));

        var taxes = new ArrayList<Integer>();
        taxes.add(123);
        taxes.add(332);
        taxes.add(23);
        taxes.add(3);
        taxes.add(1);
        taxes.add(122);

        System.out.println(taxes);

        int sum = 0;

        for (int n : taxes) {
            sum += n;
        }

        System.out.println(sum);
    }
}
