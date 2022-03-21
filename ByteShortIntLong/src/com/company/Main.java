package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVal = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted max value  = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));
        System.out.println("No parens = " + myMaxIntValue + 1);
        System.out.println("No parens regular = " + 7 * 5);


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);


        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short min range = " + myShortMinValue);
        System.out.println("Short max range = " + myShortMaxValue);

//      Long needs the letter "L" when converting ints
        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myLongMinValue);
        System.out.println("Long max value = " + myLongMaxValue);

        int myTotal = (myMinIntValue / 2);
//      CASTING - converting from one primitive type to another
//      Numbers in parens are automatically turned to int
        byte byteValue = (byte)(myMinByteValue / 2);
        short shortValue = (short)(myShortMinValue / 2);

//      exercise
        byte exByte = 10;
        short exShort = 20;
        int exInt = 50;
        long exLong = 50000 + 10 * (exByte + exInt + exShort);
        System.out.println(exLong);
    }
}
