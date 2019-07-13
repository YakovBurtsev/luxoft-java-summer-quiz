package com.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        var ints = Stream.of(Collections.singletonList(1), Arrays.asList(2, 3), Arrays.asList(1, 2, 3))
                .flatMap(Collection::stream)
                .dropWhile(d -> d < 3)
                .peek(System.out::print);

        System.out.print(":");
        ints.map(d -> d * 2)
                .forEach(System.out::print);
    }
}
