package mypack;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class TreeMapExample{
	public static void main(String args[])
	{
		TreeMap<Integer, String> hmap=new TreeMap<Integer, String>();
		//adding element
		hmap.put(1, "amenda");
		hmap.put(5, "lara");
		hmap.put(7, "jack");
		hmap.put(65, "harry");
		//display content using iterator
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
 		}
  	}
}
//note: TreeMap is sorted in the ascending order of its keys
