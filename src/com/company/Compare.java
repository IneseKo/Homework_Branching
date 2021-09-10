package com.company;

public class Compare {

    public static void main(String[] args) {
        short numberOne = 1;
        short numberTwo = 4;
        if (numberOne >= numberTwo) {
            if (numberOne > numberTwo) {
                System.out.println(" number One is greater, number Two is smaller");
            }
            else {
                System.out.println("Number One and Number Two are equal");
            }
        } else {
            System.out.println(" number Two is greater than number One");
        }

        //Here' s the part about even and odd numbers:
        numberOne = 3;
        numberTwo = 8;
        System.out.println("Number One is"  + (numberOne%2 =0?"even":"odd") + " Number Two is" + (numberTwo%2=0?"even":"odd"));

    }
}