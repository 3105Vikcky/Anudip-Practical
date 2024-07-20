package calculater;
import java.util.*;
public class Calculater 
{
	
	//Addition
	public  static void add(int a, int b) {
		int result =a+b;
		System.out.println("Addition: "+ result); 
	}
	
	
	//Subtraction
	public static void subtraction(int a, int b) {
		int result=a-b;
		System.out.println("Subtraction :" + result);
	}
	
	//Division
	public static void division(int num1, int num2) {
		if (num2==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		double result=num1/num2; 
		System.out.println("Division"+result);
	}
	
	
	public static void multiplication(int num1, int num2)
	{
		 int result = num1*num2;
		 System.out.println("Multiplication is"+ result);
		 
		
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("........Welcome to Caculater.......");
		System.out.println("Select Operation-");
		System.out.println("1. For Addition..");
		System.out.println("2. For Subtraction");
		System.out.println("3. For Multiplication");
		System.out.println("4. For Division");
		int operation=sc.nextInt();
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		
		switch(operation)
		{
		case 1 :
			 add(num1,num2);
			
				break;
				
				
		case 2:
				subtraction(num1,num2);
				break;
				
				
				
		case 3:
			   multiplication(num1,num2);
			   break;
				
				
				
				
		case 4:
				division(num1,num2);
				break;
		
		
		
		default:
			System.out.println("please Enter valid number");
			
			}
		sc.close();
		
		
		
		
		
	}

}
