class Animal{
	Animal()
	{
		System.out.println("Animal");
	}
}

public class Dog extends Animal{
	Dog()
	{
		super(); //refer parent class constructor
		System.out.println("Dog");
	}
	public static void main(String[] args) {
		Dog s1=new Dog();
	}
}

//note: call to super must be first statement in constructor
