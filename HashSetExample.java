package mypack;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample{
	public static void main(String args[])
	{
		HashSet<String> hset=new HashSet<String>();
		hset.add("amenda");
		hset.add("carry");
		hset.add("elon");
		hset.add("akon");
		hset.add("jussy");
		//adding duplicate value
		hset.add("amenda");
		hset.add("jussy");
		//adding null value
		hset.add(null);
		hset.add(null);
		//iterating
		Iterator<String> iterator=hset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
/*output:  in any random order
null
jussy
akon
amenda
elon
carry
*/
