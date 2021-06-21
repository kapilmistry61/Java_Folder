package mypack;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class LinkedHashMap_Example{
	public static void main(String args[])
	{
		LinkedHashMap<Integer, String> lhmap=new LinkedHashMap<Integer, String>();
		lhmap.put(11, "amenda");
		lhmap.put(13, "jack");
		lhmap.put(1, "lara");
		lhmap.put(41, "jarry");
		lhmap.put(33, "elon");
		//generating set of content elements
		Set set=lhmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.println("key is "+mentry.getKey()+ " value is "+mentry.getValue());
		}
	}
}
