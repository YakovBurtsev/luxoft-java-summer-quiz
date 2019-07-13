package com.test;

import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {

        var d = Stream.of(Double.NEGATIVE_INFINITY)
                .parallel()
                .reduce(10.0, (x, y) -> x / y, (p, q) -> p + q);

        System.out.println(d);
    }

}
