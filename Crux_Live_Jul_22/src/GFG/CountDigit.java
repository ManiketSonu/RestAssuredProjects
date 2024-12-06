package GFG;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=234;
		System.out.println(CountDigit1(x));
	}
	public static int CountDigit1(int x)
	{
		int ret=0; 
		while(x>0)
		{
			x=x/10;
			ret++;
		}
		return ret;
	}
}
 