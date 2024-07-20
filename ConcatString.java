/*
 * .Create a program that reads a list of strings and 
 * concatenates them into a single string using the Stream API. 
 * Avoid using lambda expressions for concatenation.
 */
import java.util.ArrayList;
import java.util.List;
public class ConcatString 
{
	public static void main(String[] args) 
	{
		List<String> name = new ArrayList<>(); //Create ArrayList 
		name.add("Vikas");// Add elements Into List
		name.add("Pravin");
		name.add("Shridhar");
		name.add("Aditya");
		System.out.println("Before Cancatination :");
		//Convert collection into stream
		name.stream().forEach(System.out::println);
		//Use Collect Method for Aggregates elements into single Result
		 String ConcatString2= name.stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
		 System.out.println("After Concatination :"+ConcatString2);
		
		
		

	}

}
