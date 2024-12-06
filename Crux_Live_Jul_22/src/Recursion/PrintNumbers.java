package Recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printnumber(n);
	}
	public static void printnumber(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printnumber(n-1);
	}
}
 