package thisP;

public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword a=new thiskeyword(111,"Mani",3000f);
		thiskeyword b=new thiskeyword(111,"kum",2000f);
		a.display();
		b.display();
	}
	int rollno;
	String name;
	float fee;
	thiskeyword(int rollno, String name, float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+" "+fee);
	}
}

//it will refer the current class instance variable.
//it is used to invoke the current class method..