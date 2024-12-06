package Method_overriding;

public class metover{
	void run()
	{
		System.out.println("metover will get error");
	}
	public static void main(String arg[])
	{
		metover a=new metover();
		a.run();
	}
}
class Bike extends metover{
	void run()
	{
		System.out.println("Bike running safely");
	}
}
//if a child class has same method as declared in parent class. 