
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int f1 = 0;
		int f2 = 1;
		int f3;
		for(int i=2;i<=n;i++)
		{
			 f3 = f1+f2;
			f1 = f2;
			f2 =f3;
			System.out.println(f3);
		}
		

	}

}
