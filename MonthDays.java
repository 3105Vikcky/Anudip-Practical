import java.time.Month;
public class MonthDays 
{
	public static void main(String[] args) 
	{
		for (Month m : Month.values()) 
		{
 
			System.out.println(m.toString() + ": " + m.length(false) + " days");
		}
	}
}
