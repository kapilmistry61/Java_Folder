import java.util.*;
class StringBuilder_Pool_Test{
	public static void main(String args[])
	{
		StringBuilder s1=new StringBuilder("s1 is printing....");
		StringBuilder s2=new StringBuilder("s2 is printing....");//constant pool
		StringBuilder s3=new StringBuilder(s1+"s3 is printing");//store in non constant pool
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
