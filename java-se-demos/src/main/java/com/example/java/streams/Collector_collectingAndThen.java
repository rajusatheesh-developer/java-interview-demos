package com.example.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector_collectingAndThen
{
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4,5,7);

        List<Integer> immutableEventNumList= list.stream()
                 .filter(n->n%2==0)
                 .collect(Collectors.collectingAndThen(
                         Collectors.toList(),List::copyOf
                 ));

        immutableEventNumList.add(10);

        System.out.println("Above line throws error so this line can't be executed");
    }
}
