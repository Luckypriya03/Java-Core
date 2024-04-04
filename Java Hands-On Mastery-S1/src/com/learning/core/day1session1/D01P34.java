package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P34 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows for the triangle: ");
	        int n = scanner.nextInt();
	        
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }

}
