package com.example.java.streams;

import java.math.BigDecimal;

public class OrderItem {

    private long id;
    private long productId;
    private int quantity;
    private BigDecimal price;
    private BigDecimal subTotal;

    public OrderItem(long id, long productId, int quantity,
                     BigDecimal price, BigDecimal subTotal) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.subTotal = subTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
}