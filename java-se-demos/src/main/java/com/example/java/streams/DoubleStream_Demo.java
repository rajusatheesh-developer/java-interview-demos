package com.example.java.streams;



import java.util.stream.DoubleStream;

/**
 * What will be the output of the following program?
 * Terminal methods of DoubleStream include count() and sum(), both of which are being executed on line 1. When a terminal method is executed, the stream is considered consumed. As a result,
 * although this code will compile, it will throw a java.lang.IllegalStateException runtime error.
 */
public class DoubleStream_Demo {
    public static void main(String []args) {
        DoubleStream values = DoubleStream.of(10.0, 20.0, 30.0, 40.0).map(i -> -i);
        System.out.printf("The count is%d, The sum is %f", values.count(), values.sum()); //Line1
    }
}