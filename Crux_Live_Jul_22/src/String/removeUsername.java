package String;

import java.util.Scanner;

public class removeUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		String usernmae="";
		
		for(int i=0; i<email.length();i++)
		{
			if(email.charAt(i)=='@')
			{
				break;
			}
			else
			{
				usernmae +=email.charAt(i);
			} 
		}
		System.out.println(usernmae);
	}

}
 