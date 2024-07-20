import java.time.LocalDate;
import java.time.MonthDay;
public class IndependenceDayChecker 
{
	public static void main(String[] args) 
	{

		LocalDate today = LocalDate.now();
		MonthDay independenceDay = MonthDay.of(8, 15);
		if (MonthDay.from(today).equals(independenceDay)) 
		{
			System.out.println("Today is Independence Day (15th August).");
		} 
		else 
		{
			if (MonthDay.from(today).isBefore(independenceDay))
			{
				System.out.println("Independence day is yet to come this year.");
			} 
			else 
			{
				System.out.println("Independence day was already celebrated this year.");
			}
		}
	}
}
