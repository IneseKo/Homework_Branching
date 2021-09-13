package com.company;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner inputDay = new Scanner(System.in);
        System.out.println("Please enter Day");
        int Day = inputDay.nextInt();
        if (Day >= 1 && Day<=31) {
            System.out.println("It's January");
        }
        else if (Day >= 32 && Day<=59) {
            System.out.println("It's February");
        }
        else if (Day >= 60 && Day<=90) {
            System.out.println("It's March");
        }
        else if (Day >= 91 && Day<=120) {
            System.out.println("It's April");
        }
        else if (Day >= 121 && Day<=151) {
            System.out.println("It's May");
        }
        else if (Day >= 152 && Day<=181) {
            System.out.println("It's June");
        }
        else if (Day >= 182 && Day<=212) {
            System.out.println("It's July");
        }
        else if (Day >= 213 && Day<=243) {
            System.out.println("It's August");
        }
        else if (Day >= 244 && Day<=273) {
            System.out.println("It's September");
        }
        else if (Day >= 274 && Day<=304) {
            System.out.println("It's October");
        }
        else if (Day >= 305 && Day<=334) {
            System.out.println("It's November");
        }
        else if (Day >= 335 && Day<=365) {
            System.out.println("It's December");
        }
        else if (Day == 366) {
            System.out.println("It' s the long year. Choose a different program");
        }
        else
            System.out.println("No more than 366 days within a year");
}
}