package mypack;
public class PassArray_To_Method{
	void pass(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		PassArray_To_Method s1=new PassArray_To_Method();
		int arr[]= {1,2,3,4};
		s1.pass(arr);
	}
}
