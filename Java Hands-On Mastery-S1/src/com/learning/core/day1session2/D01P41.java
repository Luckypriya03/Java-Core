package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P41 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Accept two numbers from the user
	        System.out.print("Enter two numbers in the range from 1 to 40: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();

	        // Single dimension array of five integer elements ranging from 1 to 40
	        int[] array = {7, 25, 5, 8, 17};

	        // Check if both numbers are found in the array
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i = 0; i < array.length; i++) {
	            if (num1 == array[i]) {
	                foundNum1 = true;
	            }
	            if (num2 == array[i]) {
	                foundNum2 = true;
	            }
	        }

	        // Display result
	        if (foundNum1 && foundNum2) {
	            System.out.println("Bingo");
	        } else {
	            System.out.println("Not found in the array");
	        }
	        
	        scanner.close();
	    }

}
