package com.example.java.generics;



import java.util.ArrayList;
import java.util.List;

/**
 * What will be the output of the following program?
 *The for(;;) loop correctly increments the loop variable so that all the elements in the list are traversed.
 *The strList.remove(i) statement will remove all elements that are <= three characters.
 */
public class ArrayList_Remove_Demo {
   public static void main(String[] args) {
      List<String> strList = new ArrayList<>();
      strList.add("Anna"); strList.add("Ada"); strList.add("Ada");
      strList.add("Bob"); strList.add("Bob"); strList.add("Adda");
      for (int i = 0; i < strList.size(); ) {
         if (strList.get(i).length() <= 3) {
            strList.remove(i);
         } else {
            ++i;
         }
      }
      System.out.println(strList);
   }
}