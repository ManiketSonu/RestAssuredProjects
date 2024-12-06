package Recursion;

public class printfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		printfib(a,b,n-2);
	}
	public static void printfib(int a, int b, int n)
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c);
		printfib(b,c,n-1);
	}
}
 