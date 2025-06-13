package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(array).anyMatch(x-> x==4));
        Arrays.stream(array).forEach(System.out::print);
        Stream<Integer> intStream = Arrays.stream(array);
        intStream.forEach(System.out::print);
        Stream<String> stringStream = Stream.of("Test", "Hallo", "Haus", "dasd");
        stringStream.forEach(System.out::println);

        List<String> stringList =
                Stream.of(1, 2, 3, 4, 5)
                        .map(Object::toString)
                        .map(s -> s + "_" + s)
                        .toList();

        System.out.println(stringList);
        stringList.stream().map(s -> s + s).forEach(System.out::println);

        Arrays.stream(array)
                .map(x -> x * x)
                .forEach(System.out::println);
        // ein stream kann nur einmal verwendet werden
        Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(array)
                .filter(x -> x % 3 == 0)
                .forEach(x -> System.out.println(x + " "));
        List<Integer> integers = List.of(2,3,2);
        Integer reduced = integers.stream().reduce(10, (a,b) -> a*b);
        System.out.println(reduced);

        String[] stringArray = {"Martin","Hans","Florian","Marten","etc."};
        Arrays.stream(stringArray)
                .map(s -> s.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);

    }
}
