package com.company;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner inputWorkingHours = new Scanner(System.in);
        System.out.println("Please enter Number of Working Hours a Day");
        int workingHoursInDay = inputWorkingHours.nextInt();
        if (workingHoursInDay > 0 && workingHoursInDay <= 8) {
            int hourlyRate = 8;
            int salaryPerDay = (workingHoursInDay * hourlyRate);
            System.out.println("Your salary for " + workingHoursInDay + " hours will be " + salaryPerDay + " Eur.");
        }
        else if (workingHoursInDay > 8 && workingHoursInDay <= 24) {
            int extraHourRate = 15;
            int salaryPerDay = (80 + ((workingHoursInDay-8)*15));
            System.out.println("Your salary for " + workingHoursInDay + " hours will be " + salaryPerDay + " Eur.");
        }
        else
            System.out.println("Please enter valid amount of hours within a working Day!");
    }
}
