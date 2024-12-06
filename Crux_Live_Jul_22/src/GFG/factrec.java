package GFG;

public class factrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact1(n));
	}
	public static int fact1(int n)
	{
		if(n==0)
		{
			return n;
		}
		return n*fact1(n-1);
	}
}
 