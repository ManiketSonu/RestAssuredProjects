package Static_Keyword;

public class Stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stat a=new Stat(111,"kamra");
		Stat b = new Stat(222,"Kunal");
		a.display();
		b.display();
	}
	int rollno;
	String name;
	static String colleage = "BSEB";
	
	Stat(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+""+colleage);
	}
}
 

// static variable --> it is used to refer the common property of all objects.
// static method --> we create static method to change the static variable.