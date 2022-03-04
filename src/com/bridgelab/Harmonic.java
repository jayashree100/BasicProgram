package com.bridgelab;
import java.util.Scanner;

class Harmonic {
		
	public static void main(String args[]) {
		    
		        System.out.print("Enter any number : ");
		        Scanner s = new Scanner(System.in);
		        int num = s.nextInt();
		        System.out.print("The Harmonic Series is : ");
		        int result = 1;
		          
				  for (int i = 1; i <= num; i++) {
					  
					  if(i < num)
					   {
						  
						  System.out.print("1/"+i+"+ ");
						  
		                  result = result + 1/( i);
					    }
					  else if (i == num)
					  {
						  System.out.print("1/"+i+" +");
						  result = result + 1/( i);
					  }
		               
		              
		          }
				  System.out.print(" ");
		        
		       // System.out.println("Output of Harmonic Series is "+result);
		    
	}
	
}
		

	


