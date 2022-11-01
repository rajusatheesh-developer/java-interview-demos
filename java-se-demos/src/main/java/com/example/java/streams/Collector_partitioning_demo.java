package com.example.java.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collector_partitioning_demo
{

    public static void main(String[] args) {

        List<String> names=List.of("satheesh","raju","manju","vijaya");

        names.stream()
                .collect(Collectors.partitioningBy((data)->data.startsWith("s")))
                .entrySet()
                .stream()
                .filter(Map.Entry::getKey)
                .flatMap(booleanListEntry -> booleanListEntry.getValue().stream())
                .forEach(System.out::println);

    }
}
