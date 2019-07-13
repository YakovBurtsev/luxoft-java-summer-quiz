package com.test;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        var var = var();
        var.stream().map(v -> v * 2 + " ").forEach(System.out::print);
    }

    private static List<Integer> var() {
        var i = '4';

        return List.of(1, 2, 3, i);
    }
}
