package com.test;

public class Task4 {
    public static void main(String[] args) {
        var t = new Thread(new QuizThread());
        t.setDaemon(true);
        t.start();

        System.out.println(QuizThread.getIntList() + ": " + QuizThread.getCounter());
    }
}
