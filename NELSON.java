import java.util.*;
public class NELSON 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n=sc.nextInt();
	    if (n%111==0)
	    {
	    	System.out.println("The number is nelson number");
	    }
	    else
	    {
	    	System.out.println("Number is not a nelson number");
	    }
		
	}

}
