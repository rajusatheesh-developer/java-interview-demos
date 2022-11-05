package com.example.java.generics;



import java.util.*;

/**
 * What will be the output of the following program?
 *
 * The output will be
 * a List: class java.util.LinkedList
 * b List: class java.util.LinkedList
 * Type erasure involves the process of enforcing type constraints only at compile time and discarding the element type information at runtime.
 * As a result, after compilation, both types are treated as the same LinkedList type.
 */
class TypeErase_Demo {
     public static void main(String []args) {
         List<Double> aList = new LinkedList<>();    
         List<Integer> bList = new LinkedList<>();
         System.out.println("a List: " + aList.getClass());
         System.out.println("b List: " + bList.getClass());
     }
}