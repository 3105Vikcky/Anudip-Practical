import java.util.*;
/*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers*/
public class Average {
	 public static void main(String []args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a:");
		 int a = sc.nextInt();
		 System.out.println("Enter b:");
		 int b = sc.nextInt();
		 System.out.println("Enter c:");
		 int c = sc.nextInt();
		 int Avg = a+b+c/3;
		 System.out.println("The Average of these three no is:"+ Avg);
	 }
}
