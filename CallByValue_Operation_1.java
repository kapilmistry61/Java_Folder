package mypack;
public class Operation{
	int data=50;
	void change(Operation obj)
	{
		data=data+500;//change will be in instance variable
	}
	public static void main(String args[])
	{
		Operation obj=new Operation();
		System.out.println("before change"+obj.data);
		obj.change(obj); //passing object
		System.out.println("after change"+obj.data);
	}
}
//output:
50
550
