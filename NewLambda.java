//Write a Java program that uses lambda expressions to manipulate strings.
//Create lambda expressions to perform the following operations on a given string: 
//Convert the string to uppercase  
//Convert the string to lowercase 
//Reverse the string.
import java.util.Scanner;
//Functional Interface
interface StringOperation 
{
	    String operate(String str);
}
public class NewLambda 
{
	    public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string you want to manipulate:");
	    	//Taking input from user
	        String input = sc.nextLine();
	        
	        // Convert to uppercase
	        StringOperation toUpper = (str) -> 
	        {
	            StringBuilder result = new StringBuilder();
	            for (char c : str.toCharArray()) 
	            {
	                if (Character.isLowerCase(c)) 
	                {
	                    result.append(Character.toUpperCase(c));
	                } 
	                else 
	                {
	                    result.append(c);
	                }
	            }
	            return result.toString();
	        };
	        
	        // Convert to lowercase
	        StringOperation toLower = str -> 
	        {
	            StringBuilder result = new StringBuilder();
	            for (char c : str.toCharArray()) 
	            {
	                if (Character.isUpperCase(c)) 
	                {
	                    result.append(Character.toLowerCase(c));
	                } else {
	                    result.append(c);
	                }
	            }
	            return result.toString();
	        };
	        
	        // Reverse the string
	        StringOperation reverse = str -> {
	            StringBuilder result = new StringBuilder();
	            for (int i = str.length() - 1; i >= 0; i--) 
	            {
	                result.append(str.charAt(i));
	            }
	            return result.toString();
	        };
	        
	        // Apply operations
	        System.out.println("Uppercase: " + toUpper.operate(input));
	        System.out.println("Lowercase: " + toLower.operate(input));
	        System.out.println("Reversed: " + reverse.operate(input));
	    }
	}



