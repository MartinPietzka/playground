package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;



public class test {
    public static void main(String[] args) {



        List<String> stringList = Stream.of(1, 2, 3, 4, 5)
                .map(Object::toString)
                .map(s -> s + "_" + s)
                .toList();

        System.out.println(stringList);

        List<String> testList = new ArrayList<>(List.of("test","fsdfsdf","dfsdfsd"));
        System.out.println(testList);

    }
}
