package com.example.java.enums;


/**
 * Enum Constants
 * - Efficient
 * - Final classes- clients cannot create it using constructor nor extend it
 * - Instance controlled
 * - a generalization of singletons, which are essentially single-element enums.
 * - Compile time safety
 * - can add methods , fields and implement interfaces
 * - Implements Comparable, Serializable
 * - Immutable
 * - constant-specific method implementations:
 * <p>
 * Questions ?
 * - what happens when you remove an element from an enum type?
 * the compilation will fail with a helpful error message
 * - advantages of using ENUM Constants ?
 */

public class EnumConstants {
    public static void main(String[] args) {

        Fruits appleFruit = Fruits.APPLE_LARGE;
        validateOrange(appleFruit);
        printFruit(appleFruit);
    }

    public static void validateOrange(Fruits fruits) {
        if (fruits == Fruits.APPLE_SMALL) {
            System.out.println("It's orange");
            return;
        }

        System.out.println("Invalid fruit");
    }

    public static void printFruit(Fruits fruits) {
        System.out.println(fruits.toString());
    }

    public static enum Fruits {
        APPLE_SMALL("APPLE", "SMALL"),
        APPLE_MEDIUM("APPLE", "MEDIUM"),
        APPLE_LARGE("APPLE", "LARGE"),

        ORANGE_SMALL("ORANGE", "SMALL"),
        ORANGE_MEDIUM("ORANGE", "MEDIUM"),
        ORANGE_LARGE("ORANGE", "LARGE");


        private final String fruit;
        private final String size;

        Fruits(String fruit, String size) {

            this.fruit = fruit;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Fruits{" +
                    "fruit='" + fruit + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }
}
