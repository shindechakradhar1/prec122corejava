package in.prec.java8features.datetimeapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {
	public static void main(String[] args) throws InterruptedException {
		LocalDate today=LocalDate.now(); 
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate demoDate = LocalDate.of(1996, 3, 31);
		System.out.println(demoDate);
		
		Period period=Period.between(today, demoDate);
		System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
		
		
		LocalTime before = LocalTime.now();
		
		Thread.sleep(200);
		
		LocalTime after = LocalTime.now();
		
		Duration duration=Duration.between(before, after);
		System.out.println(duration.get(ChronoUnit.NANOS));
		
		int month=demoDate.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		
		
		LocalDate nextDay=today.plus(1,ChronoUnit.DAYS);
		DayOfWeek day=nextDay.getDayOfWeek();
		System.out.println(day);
		
		
		LocalDate bDay = LocalDate.of(2026,2,1);
		DayOfWeek bNextYearDay = bDay.getDayOfWeek();
		System.out.println(bNextYearDay);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strdate = "01/04/2026";
		System.out.println(bDay.format(format));
		
		LocalDate formatedDate = LocalDate.parse(strdate, format);
		
		System.out.println(formatedDate);
		
		
	}
}
