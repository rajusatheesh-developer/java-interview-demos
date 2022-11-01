package com.example.java.streams;

import java.util.List;

/**
 * created by Satheesh Raju on 10-10-2022
 */
public class SkipAndLimitReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Integer sum = list.stream()
                .skip(2)
                .limit(2)
                .reduce(0, Integer::sum);

        System.out.println("Sum : " + sum);


    }
}
