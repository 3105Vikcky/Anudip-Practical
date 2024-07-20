import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		
		hm.put(11, "A");
		hm.put(22, "Z");
		hm.put(33, "B");
		hm.put(44, "D");
		
		System.out.println(hm);
		
		Set set=hm.entrySet();
		System.out.println(set);
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry map_entry=(Map.Entry) iterator.next();
			System.out.println(map_entry.getKey()+"    "+map_entry.getValue());
		}
		String s = (String)hm.get(22);
		System.out.println(s);
		hm.remove(33);
		
		Set set2=hm.entrySet();
		Iterator iterator2=set.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry map_entry2=(Map.Entry) iterator2.next();
			System.out.println(map_entry2.getKey()+"    "+map_entry2.getValue());
		}
	}

}

