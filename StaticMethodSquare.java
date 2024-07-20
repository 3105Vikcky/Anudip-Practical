//Write a Java program that demonstrates the use of method references
//for static methods. Create a functional interface and use a method 
//reference to call a static method that calculates the square of a number.
interface Calc          //Functional Interface
{
	void num(int number);
	static void square(int num) {            //static method
	System.out.println("Square is "+num*num); 
		
	}
}
public class StaticMethodSquare {

	public static void main(String[] args) 
	{
		Calc c=(int number)->{         // Lambda Expression
			System.out.println("The Number is: "+number);
		};
		c.num(5);
		Calc.square(5);

	}

}
