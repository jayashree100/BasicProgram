package com.bridgelab;
import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1" );
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2" );

		int num2 = sc.nextInt();
		
		System.out.println("before swapping the value num1 is :"+num1);
		System.out.println("before swapping the value num2 is :"+num2);

		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		
		System.out.println("after swapping the value of num1 is:"+num1);
		
		System.out.println("after swapping the value of  num2 is:"+num2);

		
	

	}

}
