package com.example.java.enums;

/**
 * final constants
 * - No Type Safety
 * - Performance issue ( String consts use comparision)
 * - Not easy to convert into Strings from Int constants
 */

public class IntConstants {


    public static void main(String[] args) {
        validateOrange(Constants.APPLE_FUJI);
        printConstant(Constants.APPLE_FUJI);
    }


    // No Type Safety
    // We can change the
    private static void validateOrange(int value) {

        if (Constants.ORANGE_BLOOD == value ||
                Constants.ORANGE_NAVEL == value ||
                Constants.ORANGE_TEMPLE == value) {
            System.out.println("Orange Fruit");
        }
    }

    // Not Easy To Convert to Strings
    private static void printConstant(int value) {

        if (Constants.ORANGE_BLOOD == value)
            System.out.println("ORANGE_BLOOD");
    }



public static class Constants {
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
}
}
