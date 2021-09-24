package com.company;

import java.util.Scanner;

public class AdditionalSeventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value in km/h:");
        System.out.println("equals approximately " + toMilesPerHour(input.nextDouble()) + " mph");
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        double result = kilometersPerHour / 1.609344;
        if (kilometersPerHour >= 0)
            return (int) Math.round(result);
        else return -1;
    }

}
