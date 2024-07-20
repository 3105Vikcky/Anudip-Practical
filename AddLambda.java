import java.util.Scanner;
interface XYZ{
	public void multiply(int a,int b);
}
public class AddLambda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		XYZ ob=(a,b)->{
			int result=a*b;
			System.out.println("The Multipliccation is:"+result);
		};
		ob.multiply(num1, num2);
		

	}

}
