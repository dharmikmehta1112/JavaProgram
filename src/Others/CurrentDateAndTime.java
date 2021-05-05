package Others;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDateAndTime {
	
	public void getCurrentDateAndTime() {
		
		int day, month, year;
		int sec, min, hour;
		
		GregorianCalendar date = new GregorianCalendar();
		
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH) + 1;
		year = date.get(Calendar.YEAR);
		sec = date.get(Calendar.SECOND);
		min = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Current Date:: " +day+ "/" +month+ "/" +year);
		System.out.println("Current Time:: " +hour+ ":" +min+ ":" +sec);

	}

	public static void main(String[] args) {

		new CurrentDateAndTime().getCurrentDateAndTime();
	}

}