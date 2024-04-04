package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monthNumber = scanner.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = months[monthNumber - 1];
            System.out.println(monthName);
        } else {
            System.out.println("Invalid input");
        }
    }
}