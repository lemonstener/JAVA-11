package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myFloatMinValue);
        System.out.println("Float max value = " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myDoubleMinValue);
        System.out.println("Double max value = " + myDoubleMaxValue);

//      Default types: whole numbers - int | decimals - double
//      Sometimes you need "f" for floats
        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("Int value = " + intValue);
        System.out.println("Float value = " + floatValue);
        System.out.println("Double value = " + doubleValue);

        int pound = 1;
        double kg = 0.45359237d;
        double weight = 30 * pound * kg;
        System.out.println(weight);
    }
}
