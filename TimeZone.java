import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class TimeZone {

	public static void main(String[] args) 
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		System.out.println(t.getNano());

		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
	}

}
