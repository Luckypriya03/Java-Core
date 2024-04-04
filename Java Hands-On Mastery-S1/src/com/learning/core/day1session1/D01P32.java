package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P32 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the week number (1-7):");
        
        int weekNumber = scanner.nextInt();

        String day;
        if (weekNumber == 1) {
            day = "Monday";
        } else if (weekNumber == 2) {
            day = "Tuesday";
        } else if (weekNumber == 3) {
            day = "Wednesday";
        } else if (weekNumber == 4) {
            day = "Thursday";
        } else if (weekNumber == 5) {
            day = "Friday";
        } else if (weekNumber == 6) {
            day = "Saturday";
        } else if (weekNumber == 7) {
            day = "Sunday";
        } else {
            day = "Invalid Input";
        }

        System.out.println(day);
    }
}