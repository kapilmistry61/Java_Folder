package mypack;
import java.util.*;
public class Java_ArrayList{
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>(); //created ArrayList
		//add elements to ArrayList
		alist.add("lara");  
		alist.add("harry");
		alist.add("tom");
		alist.add("professor");
		alist.add("jack");
		alist.add("jasey");
		alist.add("mira");
		
		//displaying ArrayList 
		System.out.println("ArrayList");
		for(String a:alist)
		{
			System.out.println(a);
		}
		
		//add elements from from the specified index
		alist.add(1,"romio");
		alist.add(3,"katty");
		
		//displaying ArrayList after change elements
		System.out.println("ArrayList after add two more elements");
		for(String a:alist)
		{
			System.out.println(a);
		}		
		//remove elements from ArrayList
		alist.remove("jasey");
		alist.remove(2);
		
		//displaying ArrayList after remove elements
		System.out.println("ArrayList after remove elements");
		for(String a:alist)
		{
			System.out.println(a);
		}
		
		//change elements from ArrayList
		alist.set(1,"elon");
		alist.set(4,"amenda");
		
		//displaying ArrayList after change elements
		System.out.println("ArrayList after change elements");
		for(String a:alist)
		{
			System.out.println(a);
		}
		
	}
}
