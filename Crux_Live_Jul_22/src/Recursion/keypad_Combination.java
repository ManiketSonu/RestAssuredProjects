package Recursion;

public class keypad_Combination {
	
	public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
			"tu", "vwx", "yz"};
	
	public static void printCombination(String str, int idx, String combination) {
		
		if(idx==str.length())
		{
			System.out.println(combination);
			return;
		}
		char currchar = str.charAt(idx);
		
		String mapping = keypad[currchar-'0'];
		for(int i=0;i<mapping.length();i++)
		{
			printCombination(str, idx+1, combination+mapping.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		printCombination(str, 0, "");
	}
	 
}
