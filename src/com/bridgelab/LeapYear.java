package com.bridgelab;
import java.util.Scanner;
import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 digit year");
	    
		int year = sc.nextInt();
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	          System.out.println("Specified year is a leap year");
	      
		 else
	         System.out.println("Specified year is not a leap year");

	}

}
