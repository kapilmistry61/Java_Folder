package mypack;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExample{
	public static void main(String args[])
	{
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("amenda");
		tset.add("carry");
		tset.add("elon");
		tset.add("akon");
		tset.add("jussy");
		//adding duplicate value
		tset.add("amenda");
		tset.add("jussy");
		//iterating
		Iterator<String> iterator=tset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
/*output: in ascending order
akon
amenda
carry
elon
jussy
*/
