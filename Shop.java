//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
import java.util.*;
public class Shop {
	public static void main(String[]args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the cost of pencil:");
	float A = sc.nextFloat();
	System.out.println("Enter the cost of pen:");
	float B = sc.nextFloat();
	System.out.println("Enter the cost of eraser:");
	float C = sc.nextFloat();
	float total= A+B+C;
	System.out.println(" The Total cost is:"+ total);
	float gst= total + (total*0.18f);
    System.out.println(" The total cost with GST is: "+ gst);
	}
}
