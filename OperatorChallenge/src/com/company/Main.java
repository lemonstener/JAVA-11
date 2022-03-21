package com.company;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double total = (firstDouble + secondDouble) * 100.00;
        System.out.println(total);

        double remainder = total % 40.00;
        boolean leftover = remainder > 0 ? true : false;
        System.out.println(leftover);
        if(leftover) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }
    }
}
