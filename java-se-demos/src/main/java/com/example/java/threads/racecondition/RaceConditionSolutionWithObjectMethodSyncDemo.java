package com.example.java.threads.racecondition;

public class RaceConditionSolutionWithObjectMethodSyncDemo {



    public static class RCCounter {
        private  int count;
        public synchronized void increment() {
                count++;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        RCCounter rcCounter=new RCCounter();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    rcCounter.increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    rcCounter.increment();
                }
            }
        });

        thread.start();
        thread1.start();

        Thread.sleep(5000);

        System.out.println(rcCounter.count);
    }

}
