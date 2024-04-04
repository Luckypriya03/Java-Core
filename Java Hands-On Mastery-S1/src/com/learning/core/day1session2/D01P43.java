package com.learning.core.day1session2;

import java.util.HashMap;
import java.util.Scanner;

public class D01P43 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        int firstRepeatingIndex = -1;
	        
	        for (int i = 0; i < n; i++) {
	            int currentElement = arr[i];
	            if (frequencyMap.containsKey(currentElement)) {
	                firstRepeatingIndex = i;
	                break; 
	            } else {
	                frequencyMap.put(currentElement, i);
	            }
	        }
	        
	        if (firstRepeatingIndex != -1) {
	            System.out.println("Index of first repeating element: " + firstRepeatingIndex);
	        } else {
	            System.out.println("No repeating elements found.");
	        }

	        scanner.close();
	    }
}
