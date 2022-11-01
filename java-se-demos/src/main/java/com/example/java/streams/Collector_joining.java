package com.example.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector_joining {
    public static void main(String[] args) {

        List<String> names = List.of("1", "2", "3");
        String join = names.stream()
                .collect(Collectors.joining());
        System.out.println("join Value : " + join);

        String joinWithSeparator = names.stream()
                .collect(Collectors.joining("-"));
        System.out.println("join Value : " + joinWithSeparator);

        String joinWithSeparatorPostPreFix = names.stream()
                .collect(Collectors.joining("-","ID:","-EMP"));
        System.out.println("join Value : " + joinWithSeparatorPostPreFix);



    }
}
