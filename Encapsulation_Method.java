package mypack;
public class Encapsulation_Method{
	public static void main(String args[])
	{
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException aa){
			//aa.printStackTrace();
			//System.out.println(aa.getMessage());
			//System.out.println(aa.toString());
			System.out.println(aa);
		}
	}
}
/*output will be print 
 (exception name, description, stack trace)
 (description)
 (exception name, description name)
 (exception name, description name)
 */
 
