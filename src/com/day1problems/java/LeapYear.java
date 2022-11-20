package com.day1problems.java;

import java.util.*;

public class LeapYear {
	
	public static void main(String[] args) {
		
		//Display of enter year
		System.out.println("Enter A Year:");
		
		// taking input from user using scanner class
		// sc is an object made of scanner class
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//1st condition to check leap year
		if(year%400 == 0) {
			System.out.println("It Is A Leap Year");
		}
		
		   //2nd condition to check leap year and not
			else if(year%4 == 0 && year%100!=0) {
				System.out.println("It Is A Leap Year"); // print the leap year
			}
				else {
					System.out.println("Not A Leap Year"); //print the not leap year
				}

	}

}
