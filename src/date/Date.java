package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String s = dtf.format(ldt1);
		System.out.println(s);
		
System.out.println("***************************************");
		
		LocalDate ld = LocalDate.now(); 
		System.out.println(ld);
		
		System.out.println(ld.getYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfMonth());
		
System.out.println("***************************************");

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
System.out.println("***************************************");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		
		
		
		
		
		
	}
}
