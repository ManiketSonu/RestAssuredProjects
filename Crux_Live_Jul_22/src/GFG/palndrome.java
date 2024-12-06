package GFG;

public class palndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=363;
		System.out.print("Palindrome number is "+ ispal(n));
	}
	public static boolean ispal(int n)
	{
		int rev=0;
		int temp=n;
		while(temp!=0)
		{
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10; 
		}
		return (rev==n);
	}
}
