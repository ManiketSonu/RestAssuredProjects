package Recursion;

public class calculatepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, x=2;
		int ans = calpower(x,n);
		System.out.println(ans);
	}
	public static int calpower(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		int xpownm1 = calpower(x,n-1);
		int xpown = x*xpownm1;
		return xpown;
	}
}
 