package com.example.java.java17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AsyncCodeDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        IntStream.range(1, 1_000_000)
                .mapToObj(String::valueOf)
                .forEach(list::add);

        list.stream().forEach(System.out::println);
        System.out.println("Completed");
    }
}
