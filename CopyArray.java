package mypack;
public class CopyArray{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("original array"+arr[i]);
		}
		int carr[]=arr.clone();
		for(int i=0; i<carr.length; i++)
		{
			System.out.println("copy array"+carr[i]);
		}
	}
}
