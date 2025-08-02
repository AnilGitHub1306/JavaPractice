package date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date1 {
	public static void main(String[] args) {

		LocalDateTime dateAndTime = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String Todaysdate = fmt.format(dateAndTime);
		System.out.println(Todaysdate);
	}
}
