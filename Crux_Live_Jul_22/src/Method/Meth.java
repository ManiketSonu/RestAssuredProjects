package Method;

import java.util.Scanner;

public class Meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		findevenodd(num);
	}
	
	public static void findevenodd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+"is even");
		}
		else
		{
			System.out.println(num+"is odd");
		}
	}
}


//Method --> It is a group of code which is perform certain task.
//Access specifier --> public, private, protected, default.
//Public --> it is accessible by all classes.
//private --> it is accessible by only in the classes where it is defined.
//protected --> it is accessible in the same package.
//default --> when we not use any specifier in the method declaration then java use default and it is only in the same package only.

//static method --> A method that belongs to a class rather than instance of the class, we can call static method without creating an object.
//Abstract method --> that does not have body.

