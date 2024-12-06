package Recursion;

public class SubsequencessString {
	
	public static void Subsequences(String str, int idx, String newString)
	{
		if(idx==str.length())
		{
			System.out.println(newString);
			return;
		}
		char currchar = str.charAt(idx);
		Subsequences(str, idx+1,newString+currchar);
		
		Subsequences(str, idx+1, newString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Subsequences(str,0,"");
	}

}
 