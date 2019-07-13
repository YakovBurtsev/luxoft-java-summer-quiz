package com.test;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        var j = Integer.MAX_VALUE - 1;
        var ints = new ArrayList<>();

        for (int i = j; i <= j + 1; i++) {
           ints.add(i);
        }

        System.out.println(ints.size());
    }
}
