package supere;

class Animal{
	String color= "white";

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
		
	}
}
class Dog extends Animal{
	String color="Black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
class supra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printcolor();
	}

}


//it is used to refer immediate parent class instance variable.
//it is used to invoke immediate parent class method.
////it is used to invoke immediate parent class constructor.