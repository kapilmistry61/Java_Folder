package mypack;
public class Operation{
	int data=50;
	void change(int data)
	{
		data=data+50;//change will be in local variable
	}
	public static void main(String args[])
	{
		Operation obj=new Operation();
		System.out.println("before change "+obj.data);
		obj.change(500); //passing value
		System.out.println("after change "+obj.data);
	}
}
/* outpot:
before change 50
after change 50
*/
