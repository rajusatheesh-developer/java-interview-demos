package com.example.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector_counting {
    public static void main(String[] args) {

        List<Integer> names = List.of(1, 5, 3);
        Long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("count Value : " + count);

    }
}
