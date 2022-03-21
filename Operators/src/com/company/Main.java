package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println(result);
        result++;
        System.out.println(result);
        result += 5;
        System.out.println(result);

//      you need a code block for more than one statement
        boolean isAlien = false;
        if(!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("Whew");
        }
//      you can just indent when only executing one statement
//      always use code blocks
        else
            System.out.println("It is an alien!!!");

        int topScore = 100;
        if(topScore > 99) {
            System.out.println("New high score!!!");
        } else {
            System.out.println("Try again");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore<100) {
            System.out.println("Weird comparison is true");
        }
//      you can separate statements with additional parens (for better legibility)
        if((topScore > 90) || (secondTopScore > 90)) {
            System.out.println("One of you won!!");
        }

        int newValue = 50;

        if(newValue == 50) {
            System.out.println("ERROR");
        }

//      weird bug
        boolean isCar = false;
        if(isCar == true) {
            System.out.println("Not supposed to happen");
        }
//      ternary (shorthand logical) operator
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
    }
}
