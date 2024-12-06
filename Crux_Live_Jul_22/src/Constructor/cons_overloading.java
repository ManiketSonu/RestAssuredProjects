package Constructor;

public class cons_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons_overloading a=new cons_overloading(111,"kamm");
		cons_overloading b=new cons_overloading(222,"wali bai");
		a.display();
		b.display();
	}
	int id;
	String name;
	int age;
	
	cons_overloading(int i, String n)
	{
		id=i;
		name=n;
	}
	cons_overloading(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
}
