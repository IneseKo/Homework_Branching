package com.company;
import java.util.Scanner;
import java.time.YearMonth;

public class FourthAlt {
    public static void main(String[] args) {
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Please enter the Month of a Year");
        int month = inputMonth.nextInt();
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int year = inputYear.nextInt();
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("There are " + daysInMonth + " days in Month No" + month + " of Year " + year);
    }
}
