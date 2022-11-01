package com.example.java.threads.racecondition;

public class RaceConditionSolutionWithStaticBlockSyncDemo {

    private static int count;

    public static void increment() {
        synchronized (RaceConditionSolutionWithStaticBlockSyncDemo.class) {
            count++;

        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    increment();
                }
            }
        });

        thread.start();
        thread1.start();

        Thread.sleep(5000);

        System.out.println(count);
    }

}
