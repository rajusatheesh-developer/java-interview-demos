package com.example.java.generics;




import java.util.Arrays;

/**
 * What will be the output of the following program?
 * The output will be Baseball,Football,Soccer,
 * The default comparator in the sort() method is ascending. When you pass null as the second argument, the compiler will interpret the sort order as the default (ascending).
 * As a result, the elements will be sorted in ascending order.
 */
class Arrays_Sort_Demo {
    public static void main(String[] args) {
         String[] sports = {"Football", "Soccer", "Baseball"};
         Arrays.sort(sports, null);   
         for(String sport : sports) {
             System.out.print(sport + ",");
         }
    }
}