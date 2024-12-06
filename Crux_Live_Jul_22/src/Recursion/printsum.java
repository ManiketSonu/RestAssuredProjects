package Recursion;

public class printsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsumm(1,5,0);
	}
	public static void printsumm(int i, int n, int sum)
	{
		if(i==n)
		{
			sum = sum+i;
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		printsumm(i+1,n,sum);
	}
}
 