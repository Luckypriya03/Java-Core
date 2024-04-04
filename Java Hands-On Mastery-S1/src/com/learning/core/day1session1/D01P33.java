package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Marks:");
		int marks=sc.nextInt();
		if(marks>=60) {
			System.out.println("A Grade");
		}
		else if(marks>=45) {
			System.out.println("B Grade");
		}
		else if(marks>=35) {
			System.out.println("C Grade");
		}
		else if(marks<35) {
			System.out.println("Fail");
		}

	}

}


