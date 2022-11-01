package com.example.java.threads.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockUsingLockSolution
{

    public static void main(String[] args) {

        Counter counter=new Counter();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.decrement();
                }
            }
        });

        thread1.start();
        thread2.start();
    }



    public static class Counter
    {
        private final ReentrantLock lock1=new ReentrantLock();
        private final ReentrantLock lock2=new ReentrantLock();

        private int count=0;
        public void increment()
        {
            try
            {
                lock1.lock();
                count++;
                lock2.lock();
                System.out.println("After inc : "+count);

            } finally {
                lock2.unlock();
                lock1.unlock();
            }

        }
        public void decrement()
        {
            try
            {
                lock1.lock();
                count--;
                lock2.lock();
                System.out.println("After dec : "+count);

            } finally {
                lock2.unlock();
                lock1.unlock();
            }

        }
    }


}
