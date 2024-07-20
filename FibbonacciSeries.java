// To print Fibbonacci series
import java.util.Scanner;

public class FibbonacciSeries 
{
	public static void fibbonacci(int number)
	{
		int a = 0;
		int b=1;
		int i=0;
		System.out.println("The fibbonacci Series is: ");
		while(number>i)
		{
			int result=a+b;
			System.out.println(result);
			b=a;
			a=result;
			i++;
			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		fibbonacci(number);
		

	}

}
