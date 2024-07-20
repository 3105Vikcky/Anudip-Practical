import java.util.*;
public class Array26 
{

	public static int Update(String[] menu ,String key) 
	{
		for(int i=0; i<=menu.length; i++) 
		{
			if(key==menu[i]) {
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) 
	{
	  //String menu[] = {"dosa", "samosa", "Vadapav", "Fruti"};
	  //String key ="Vadapav";
		Scanner sc=new Scanner(System.in);
		String menu[] =new String[10];
		menu[0]= sc.next();
		menu[1]= sc.next();
		menu[2]= sc.next();
		menu[3]= sc.next();
		menu[4]= sc.next();
		menu[5]= sc.next();
		menu[6]= sc.next();
		String key=menu[5];
       
	  int index= Update(menu, key);
	  if(index==-1)
	  {
		  System.out.println("Value Not Found");
	  }
	  else {
		  System.out.println("Value found at index:"+index);
	  }
	  
		
	}

}
