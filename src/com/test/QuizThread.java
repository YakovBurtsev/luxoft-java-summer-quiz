package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class QuizThread implements Runnable {
    private static List<Integer> ints = Arrays.asList(1, 2, 3);

    private static int counter = 3;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {

        } finally {
            ints.add(++counter);
        }
    }

    static List<Integer> getIntList() {
        return ints;
    }

    static int getCounter() {
        return counter;
    }
}
