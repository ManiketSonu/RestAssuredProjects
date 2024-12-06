package Object_And_Class;

public class OC {
	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OC a=new OC();
		a.id=101;
		a.name="Mani";
		System.out.println(a.id);
		System.out.println(a.name);
	}
}

//Object---> An entity which has state, behavior and identity called Object.
//Class----> It is a group of object which has common property.
//Instance of a variable --> A variable which is created inside of class but outside of method is called instance of class. It will not get 
//memory at compile time, it will get memory at run time when object will created.
