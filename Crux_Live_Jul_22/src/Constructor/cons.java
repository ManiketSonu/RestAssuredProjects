package Constructor;

public class cons {
	
	//Default Constructor
//	cons()
//	{
//		System.out.println("calling default cons");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons a=new cons(111,"Mani");
		cons b=new cons(222,"ket");
		a.display();
		b.display();
	}
	// Parameterized Constructor
	int id;
	String name;
	cons(int i, String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
}
 

//Constructor --> It is same like method, it is called when instance of the class is created.
//Rules for creating a constructor.
		// Constructor name same as the class name.
		// A Constructor cannot be abstract, static, final.
//Two types of constructor --> Parameterized constructor and default constructor.

//constructor overloading --> it is a technique having more than one constructor but different in parameter.