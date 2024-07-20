/*
 * 1.Write a Java program to associate the specified value with
 *  the specified key in a HashMap. [Hint:Create HashMap and store few
 *   elements on it] 
 */
import java.util.HashMap;
public class NewHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer , String>hm=new HashMap<Integer, String>();   
		hm.put(1, "DSA"); //Store element in hashmap
		hm.put(2, "JAVA");
		hm.put(3, "OT");
		hm.put(4, "SPM");
		hm.put(5, "PYTHON");
		hm.put(6, "OOSE");
		hm.put(7, "NETWORKING");
		hm.put(8, "OSC");
		System.out.println(hm);

	}

}
