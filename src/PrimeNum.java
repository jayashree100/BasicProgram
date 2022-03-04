
public class PrimeNum {
	 static boolean isPrime(int num)
	 {
		 if(num<1)
			 return false;
		 for(int i=2;i<num/2;i++)
		 {
			 if(num%i==0)
			return false;
		 }
		 return true;
	 }
	 

	public static void main(String[] args) {
		int num=45;
		String s=num+ " is not a prime number";
		
	    if(isPrime(num))
	    {
	    	s=num+"is primenumber";
	    System.out.println(s);
	    }
	    System.out.println(s);

	}

}
