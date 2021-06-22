package mypack;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSet_Example{
	public static void main(String args[])
	{
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("amenda");
		lhset.add("carry");
		lhset.add("elon");
		lhset.add("akon");
		lhset.add("jussy");
		//adding duplicate value
		lhset.add("amenda");
		lhset.add("jussy");
		//iterating
		Iterator<String> iterator=lhset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
/*output: in insertion order
amenda
carry
elon
akon
jussy
*/
