package mypack;
import java.util.*;
public class JavaVector{
	public static void main(String args[])
	{
		Vector<String> vec=new Vector<String>(2);
		vec.addElement("orange");
		vec.addElement("banana");
		vec.addElement("apple");
		vec.addElement("mango");
		//checking size and CapicityIncrement
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		//add elements 
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		//checking size and CapicityIncrement after add two more elements
		System.out.println("after add two more elements = "+vec.size());
		System.out.println("after add two more elements = "+vec.capacity());
		
		//displaying vector
		Iterator<String> e=vec.iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
	}
}
