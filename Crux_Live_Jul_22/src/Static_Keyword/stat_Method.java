package Static_Keyword;

public class stat_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat_Method.change();
		stat_Method a = new stat_Method(111,"kunal");
		stat_Method b = new stat_Method(222,"beta");
		a.display();
		b.display();
	}
	int rollno;
	String name;
	static String college = "C.M";
	
	static void change()
	{
		college = "MRM";
	}
	stat_Method(int i, String n)
	{
		rollno=i;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
 