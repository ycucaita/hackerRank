import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeConversionMain {

	public static void main(String[] args) {
		
		String time = "00:00:00AM";
		
		String Result= LocalTime.parse(time,DateTimeFormatter.ofPattern("hh:mm:ssa"))
				                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println(Result);
		

	}

}
