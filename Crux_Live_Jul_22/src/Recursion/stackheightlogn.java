package Recursion;

public class stackheightlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2, n=5;
		int ans = calpow(x,n);
		System.out.println(ans);
	}
	public static int calpow(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n%2==0)
		{
			return calpow(x, n/2)*calpow(x,n/2);
		}
		else
		{
			return calpow(x, n/2)*calpow(x,n/2)*x;
		}
	}
}
 