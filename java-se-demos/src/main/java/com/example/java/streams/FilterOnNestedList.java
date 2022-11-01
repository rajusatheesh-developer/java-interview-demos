package com.example.java.streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterOnNestedList {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, 1, Set.of(
                        new OrderItem(1, 1, 1, BigDecimal.valueOf(100),
                                BigDecimal.valueOf(2000))
                )),
                new Order(1, 1, Set.of(
                        new OrderItem(1, 1, 1, BigDecimal.valueOf(100),
                                BigDecimal.valueOf(2000))
                ))
        );

        List<Integer> productIds = List.of(1, 2, 3);

        List<Order> list = orders
                .stream()
                .filter(o ->
                        o.getItems().stream().anyMatch(oi ->
                                productIds.contains(oi.getProductId())))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
