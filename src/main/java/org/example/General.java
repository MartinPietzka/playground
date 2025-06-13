package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class General {
    static String fieldString;

    public static void main(String[] args) {
        String localVarString;
//      System.out.println(localVarString);
        System.out.println(fieldString);
        System.out.println("--------");

        String[] strings = {"test", "fgdf", "pplp"};
        for (String word : strings) {
            System.out.println(word);
        }

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> alist = Arrays.asList(array);
        System.out.println(array[0]);
        System.out.println(alist);


    }
}
