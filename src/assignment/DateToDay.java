package assignment;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateToDay {

	public static String getDay(int date, int month, int year) {

		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, date);
		cal.set(Calendar.YEAR, year);
		
		
		System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());
		

		return "";

	}

	public static void main(String[] args) {

		DateToDay.getDay(25, 2, 1998);

	}

}
