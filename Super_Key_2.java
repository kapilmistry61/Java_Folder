
 class Animal {
	void coler()
	{
		System.out.println("black");
	}
}
public class Dog extends Animal{
	void coler()
	{
		System.out.println("white");
		super.coler(); //refer Parent class method by super keyword
	}
	public static void main(String args[])
	{
		Dog s1=new Dog();
		s1.coler();
	}
}
