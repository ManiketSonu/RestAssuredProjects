package String;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration..
//		String name="Mani";
//		System.out.println(name);
		
		//Input from users
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		
//		System.out.println("The name is "+name);
		
		//Concatenation
		String firstname="Mani";
		String lastname="ket";
		
		String fullname=firstname+""+lastname;
		System.out.println(fullname);
		
		//print full length
		System.out.println(fullname.length());
		
//		Access characters of a string
		for(int i=0;i<fullname.length();i++)
		{ 
			System.out.print(fullname.charAt(0)); 
		}
	}

}
 