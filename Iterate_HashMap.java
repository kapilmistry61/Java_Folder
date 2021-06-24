package mypack;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class Iterate_HashMap{
	public static void main(String args[])
	{
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(11,"kapil");
		hmap.put(12,"kapil3");
		hmap.put(13,"kapil4");
		Set set=hmap.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry emap=(Map.Entry)it.next();
			System.out.println("key is "+emap.getKey()+"value is "+emap.getValue());
		}
	}
}
