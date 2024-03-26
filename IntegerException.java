/*
 * Write a program that prompts the user to enter an integer 
 *Handle the InputMismatchException that might occur if the user enters a non-integer value. 
 */
import java.util.*;
public class IntegerException 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try 
	{
		System.out.println("Enter Integer Number=");
		int s=sc.nextInt();
		System.out.println("Integer ="+s);
	}
	catch( InputMismatchException ie)
	{
		System.out.println("You entered non integer value");
		ie.printStackTrace();
	}
	sc.close();
}
}
