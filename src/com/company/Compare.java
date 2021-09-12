package com.company;

import java.sql.SQLOutput;

public class Compare {

    public static void main(String[] args) {
        // Comparing numbers:
        short numberOne = 1;
        short numberTwo = 4;
        if (numberOne >= numberTwo) {
            if (numberOne > numberTwo) {
                System.out.println(" number One is greater, number Two is smaller");
            } else {
                System.out.println("Number One and Number Two are equal");
            }
        } else {
            System.out.println(" number Two is greater than number One");
        }

        //Even and odd numbers:
        numberOne = 3;
        numberTwo = 8;
        System.out.println("Number One is " + (numberOne % 2 != 0 ? "odd" : "even"));
        System.out.println("Number Two is " + (numberTwo % 2 != 0 ? "odd" : "even"));

        //Positive and negative numbers:
        numberOne = 7;
        numberTwo = -6;
        if (numberOne > 0 && numberTwo > 0) {
            System.out.println("Both numbers are positive");
        } else if (numberOne < 0 && numberTwo < 0) {
            System.out.println("Both numbers are negative");
        } else {
            System.out.println("One of the numbers is positive and the other one is negative");
        }

        //Numbers that are less than 100:
        numberOne = 78;
        numberTwo = 111;
        if (numberOne < 100) {
            System.out.println("Number One is less than 100");
        } else if (numberTwo < 100) {
            System.out.println("Number Two is less than 100");
        } else
        System.out.println("None of the numbers is less than 100");
    }
}