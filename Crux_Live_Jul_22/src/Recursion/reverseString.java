package Recursion;

public class reverseString {
	
	public static void printReverse(String str, int idx)
	{
		if(idx==0)
		{
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.println(str.charAt(idx));
		printReverse(str,idx-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		printReverse(str,str.length()-1);
	}

}
 