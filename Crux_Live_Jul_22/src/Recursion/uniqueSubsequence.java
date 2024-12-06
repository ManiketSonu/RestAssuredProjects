package Recursion;

import java.util.HashSet;

public class uniqueSubsequence {

	public static void Subsequences(String str, int idx, String newString, HashSet<String> set)
	{
		if(idx==str.length())
		{
			if(set.contains(newString)) {
				return;
			}
			else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currchar = str.charAt(idx);
		Subsequences(str, idx+1,newString+currchar,set);
		
		Subsequences(str, idx+1, newString,set);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		HashSet<String> set = new HashSet<String>();
		Subsequences(str,0,"", set);
	}

}
 