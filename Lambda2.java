import java.util.Scanner;
@FunctionalInterface
interface ABC{
	public void display(String s);
	
}
public class Lambda2  
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		ABC ob=(s)->System.out.println("Your name is "+s);
		ob.display(name);

	}

}
