package method_overloading;

import method_overloading.Adder;

public class metover {
	
	//changing number of arguments.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(11,1));
		System.out.println(Adder.add(11, 2, 3));
	}
	
}
class Adder{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

//if a class has multiple methods having same name but different in parameter.  