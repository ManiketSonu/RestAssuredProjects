package Recursion;

public class Occurence {
	public static int first=-1;
	public static int last=-1;
	
	public static void Occur(String str, char eleement, int idx)
	{
		if(idx==str.length())
		{
			return;
		}
		if(str.charAt(idx)==eleement)
		{
			if(first==-1)
			{
				first=idx;
			}
			else
			{
				last=idx;
			}
		}
		Occur(str, eleement, idx+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaacdaefaah";
		char eleement='a';
		Occur(str,eleement, 0);
		
		System.out.println("first occurence"+first);
		System.out.println("last occurence"+last); 
		
	}
	
}
