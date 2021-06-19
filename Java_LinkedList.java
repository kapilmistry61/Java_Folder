package mypack;
import java.util.*;
public class Java_LinkedList{
	public static void main(String args[]) {
		LinkedList<String> alist=new LinkedList<String>();
		//adding elements to the LinkedList
		alist.add("amenda");
		alist.add("jack");
		alist.add("harry");
		alist.add("ninsa");
		alist.add("misa");
		//iterating LisnkedList
		System.out.println("iterating LisnkedList");
		Iterator<String> iterator=alist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//adding elements to the LinkedList
		alist.add("mica");
		alist.addFirst("cerny");
		alist.addLast("lara");
		//iterating after add elements to LisnkedList
		System.out.println("iterating after add elements to LisnkedList");
		Iterator<String> iterator2=alist.iterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		
		//removing elements from the LinkedList
		alist.remove("harry");
		alist.removeFirst();
		alist.removeLast();
		//iterating after removed elements LisnkedList
		System.out.println("iterating after removed elements LisnkedList");
		Iterator<String> iterator1=alist.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
	}
}
