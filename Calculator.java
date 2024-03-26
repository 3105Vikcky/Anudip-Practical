/*Create a Java program that acts as a simple calculator.
 *The program should prompt the user to enter two numbers and an operator (+, -, *, /).
 *Perform the corresponding calculation based on the operator. ● 
 *Handle potential exceptions, such as division by zero or invalid operator input.
 *Display the result or an appropriate error message.
 */
import java.io.*;
import java.util.Scanner;
public class Calculator 
{
	public static void Calculation(float a,float b, String Op )
	{
		float c;
		 switch(Op) 
		 {
		 case "+":c=a+b;
			 System.out.println("Additioin of these two number is="+c);
			 break;
		 case "-":c=a-b;
		 	System.out.println("Subtraction of these two number is="+c);
		 	 break;
		 case "*":c=a*b;
		     System.out.println("Multiplication of these two number is="+c);
		     break;
		 case "/":
			 try {
				 
				 if (b == 0) 
				 {
					 throw new ArithmeticException("Division by zero is not allowed");
				 }
				 else 
				 {
					 c=a/b;
					 System.out.println("Division of these two number is="+c);
				 }
				 
				 } 
				 catch(ArithmeticException ae)
			 	{
					 System.out.println("Can't divide with 0");
					 ae.printStackTrace();
					 
				 } break;
		 default:
			 	System.out.println("Invalid Oprater");
		 }
	 }
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter first number=");
			float A=sc.nextInt();
			System.out.println("Enter second numbner=");
			float B=sc.nextInt();
			System.out.println("To perform Operation Enter Oprater=");
			String O1=sc.next();
			Calculation(A,B,O1);
		
	}

}
