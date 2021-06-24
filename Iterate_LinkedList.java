package mypack;
import java.util.*;
public class Iterate_LinkedList{
	public static void main(String args[])
	{
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("amenda");
		llist.add("elon");
		llist.add("jack");
		llist.add("harry");
		Iterator it=llist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
