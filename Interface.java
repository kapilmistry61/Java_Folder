interface Printable{
	void print();
}
public class A implements Printable{
	public void print()
	{
		System.out.println("data printing.....");
	}
	public static void main(String[] args) {
		Printable s1=new A();
		s1.print();
	}
}
