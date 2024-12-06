package GFG;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		int rev=1;
		for(int i=2;i<=n;i++)
		{
			rev=rev*i;
		}
		return rev;
	}
}
 