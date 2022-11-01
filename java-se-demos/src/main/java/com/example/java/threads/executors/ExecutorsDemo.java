package com.example.java.threads.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * created by Satheesh Raju on 07-10-2022
 */
public class ExecutorsDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

    }

    static class OddRunnable implements Runnable
    {

        @Override
        public void run() {

        }
    }


    static class EvenRunnable implements Runnable
    {

        @Override
        public void run() {

        }
    }

    static class NumberPrinter
    {


        public void printOdd(int n)
        {
            try
            {

                for (int i=0;i<n;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                    else
                    {
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }

        }

        public void printEven(int n)
        {
            for (int i=0;i<n;i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                }
                else
                {

                }
            }
        }

    }
}
