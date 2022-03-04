package com.bridgelab;
import java.util.Scanner;

public class PowTwo {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = sc.nextInt();
		
		if(N>=0&&N<32) 
		{
		   for(int i=0;i<=N;i++)
		   {
			  //System.out.println(2*i);
			   int power = (int)Math.pow(2, i);
			   System.out.println(power);
					   
		  }
		}   
	  
	}

}
