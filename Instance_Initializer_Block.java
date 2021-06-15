class A{
	A()
	{
		System.out.println("A is created");
	}
}
public class B extends A{
	B()
	{
		super();
		System.out.println("B is created");
	}
	{System.out.println("instance initializer block");}
	public static void main(String[] args) {
		B s1=new B();
	}
}
//Note: instance initializer block invoke after parent class constructor 
