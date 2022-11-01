package com.example.java.collections;

public class PrimeNumberDemo
{

    public static void main(String[] args) {
        var n=100;

        for (int i = 1; i < n; i++) {
            var count=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0)
                    count++;
            }

            if(count==2)
            System.out.println(i);
        }
    }
}
