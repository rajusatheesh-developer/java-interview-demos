package com.example.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector_max_min {
    public static void main(String[] args) {

        List<Integer> names = List.of(1, 5, 3);
        Integer max = names.stream()
                .collect(Collectors.maxBy(Integer::compareTo))
                .orElse(null);
        System.out.println("Max Value : " + max);

        Integer min = names.stream()
                .collect(Collectors.minBy(Integer::compareTo))
                .orElse(null);

        System.out.println("Min Value : " + min);
    }
}
