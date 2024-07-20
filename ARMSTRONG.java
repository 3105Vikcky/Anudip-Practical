import java.util.*;
public class ARMSTRONG 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check the number is armstrong or not:");
		int n=sc.nextInt();
		if(n%10*n%10*n%10+((n/10)%10)*((n/10)%10)*((n/10)%10)+((n/100)%10)*((n/100)%10)*((n/100)%10)==n)
		{
			System.out.println("Number is armstrong number");
		}
		else {
			System.out.println("The number is not a armstrong number");
		}
		
	}

}
