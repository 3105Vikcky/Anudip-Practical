/*Write a program that reads a list of strings 
 * and removes duplicate strings from the list using the Stream API. 
 * Avoid using lambda expressions for this task
 */
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicateString 
{
	public static void main(String[] args) 
	{
		List<String> SurName= new ArrayList<>();
		SurName.add("Bargal");//add element in list
		SurName.add("Padul");	
		SurName.add("More");
		SurName.add("Patil");
		SurName.add("Gupta");
		SurName.add("Padul");
		SurName.add("Gupta");
		//Convert Collection into stream by using stream()
		SurName.stream().forEach(System.out::println);
		System.out.println("After the removing duplicate string from the list:");
		// distinct() Returns a stream with distinct elements, eliminating duplicates.
		SurName.stream().distinct().forEach(System.out::println);;
		
		
	}

}
