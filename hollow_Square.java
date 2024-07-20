import java.util.*;
public class hollow_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Lenght:");
				int length = sc.nextInt();
				System.out.println("Enter Breadth:");
				int breadth = sc.nextInt();
			
		
		// TODO Auto-generated method stub
     vikas p = new vikas();
		
    	p.pat(length, breadth);	 
	}

}
 class vikas{
	void pat(int length, int breadth)
	{
		for(int i = 1; i<=length; i++)
		{
			for(int j = 1; j<=breadth; j++)
			{
				if(i==1  || i==length || j==1|| j==breadth) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}


