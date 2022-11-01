package com.example.java.streams;


import java.util.HashSet;
import java.util.Set;


public class Order {
    private long id;
    private long userId;
    private Set<OrderItem> items=new HashSet<>();

    public Order(long id, long userId, Set<OrderItem> items) {
        this.id = id;
        this.userId = userId;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }
}


