package com.example.java.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collector_summarizing {
    public static void main(String[] args) {

        List<Integer> names = List.of(1, 5, 3);
        IntSummaryStatistics summaryStatistics = names.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Max : "+summaryStatistics.getMax());
        System.out.println("Min : "+summaryStatistics.getMin());
        System.out.println("Average : "+summaryStatistics.getAverage());
        System.out.println("Count : "+summaryStatistics.getCount());
        System.out.println("Sum : "+summaryStatistics.getSum());
    }
}
