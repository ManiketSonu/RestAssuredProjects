package Recursion;

public class removeduplicateString {
	
	public static boolean[] map = new boolean[26];
	
	public static void removeduplicate(String str, int idx, String newString)
	{
		if(idx==str.length())
		{
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(map[currChar-'a'])
		{
			removeduplicate(str,idx+1,newString);
		}
		else
		{
			newString +=currChar;
			map[currChar-'a'] = true;
			removeduplicate(str,idx+1,newString);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbccda";
		removeduplicate(str, 0,"");
	}

}
 