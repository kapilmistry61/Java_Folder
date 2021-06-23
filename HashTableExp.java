package mypack;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class HashTableExp{
	public static void main(String args[])
	{
		Hashtable<String, String> htbl=new Hashtable<String, String>();
		htbl.put("key1","amenda");
		htbl.put("key2","elon");
		htbl.put("key3","jack");
		htbl.put("key4","harry");
		htbl.put("key5","lara");
		//adding elements
		htbl.put("key6","mira");
		htbl.put("key7","jany");
		//generating
		Set set=htbl.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry emap=(Map.Entry)iterator.next();
			System.out.println("key is ="+emap.getKey()+"value is "+emap.getValue());
		}	
	}
}
