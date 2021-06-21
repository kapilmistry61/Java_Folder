package mypack;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class HashMapExample{
	public static void main(String args[])
	{
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		//adding element
		hmap.put(11, "amenda");
		hmap.put(5, "lara");
		hmap.put(7, "jack");
		hmap.put(6, "harry");
		//display content using iterator
		Set smap=hmap.entrySet();
		Iterator dis=smap.iterator();
		while(dis.hasNext())
		{
			Map.Entry mentry=(Map.Entry)dis.next();
			System.out.println("key is "+mentry.getKey()+ "value is "+mentry.getValue());
 		}
		//getting value on key 
		String str=hmap.get(6);
		System.out.println("value at index 6 is "+str);
		//remove value
		hmap.remove(7);
		//display content using iterator after delete one element
		Set smap1=hmap.entrySet();
		Iterator dis1=smap1.iterator();
		while(dis1.hasNext())
		{
			Map.Entry mentry1=(Map.Entry)dis1.next();
			System.out.println("key is "+mentry1.getKey()+ "value is "+mentry1.getValue());
 		}		
		
		
  	}
}
