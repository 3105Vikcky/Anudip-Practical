import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		
		hm.put(11, "A");
		hm.put(22, "Z");
		hm.put(33, "B");
		hm.put(44, "D");
	
		System.out.println(hm);
		
		System.out.println(hm.put(33, "s"));
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c = hm.values();
		System.out.println(c);
		}

}
