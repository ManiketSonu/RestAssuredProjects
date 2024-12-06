package String;

import java.util.Scanner;

public class commulativeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		
		String array[] = new String[size];
		
		int toLength = 0;
		
		for(int i=0;i<size;i++)
		{
			array[i]  = sc.next();
			toLength +=array[i].length();
		}
		
		System.out.println(toLength);
	}

}
   