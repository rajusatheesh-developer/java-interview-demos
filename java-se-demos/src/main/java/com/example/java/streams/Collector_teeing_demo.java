package com.example.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector_teeing_demo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = integers.stream().collect(Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo),
                (min, max) -> {
                    return min.get() + max.get();
                }
        ));

        System.out.printf("Result : " + result);
    }
}
