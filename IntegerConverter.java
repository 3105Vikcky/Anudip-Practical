import java.util.Scanner;
public class IntegerConverter 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
				try 
				{
					System.out.print("Enter a number: ");
					String a = scanner.nextLine();
					int n = Integer.parseInt(a);
					System.out.println("Converted number: " + n);
				} 
				catch (NumberFormatException e) 
				{
					System.out.println("Error: Invalid number format. Please enter a valid integer.");
				} 
				catch (NullPointerException e) 
				{
					System.out.println("Error: Null input. Please enter a valid string.");
				}
				scanner.close();
		}
		
}

