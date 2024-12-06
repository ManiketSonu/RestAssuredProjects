package supere;


class Abc{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Adc extends Animal{
	public void eat()
	{
		System.out.println("bread eating");
	}
	void bark()
	{
		System.out.println("Barking");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
class supra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adc d=new Adc();
		d.work();
	}

} 
