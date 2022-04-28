package CalendarLesson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarLesson {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("西暦yyyy年MM月dd日");
		cal.setTime(now);
		String n_day = sdf.format(now);
		System.out.println(n_day);
		int day = cal.get(Calendar.DATE);
		cal.set(Calendar.DATE, day+100);
		Date d = cal.getTime();
		String result=sdf.format(d);
		System.out.println(result);
	}
}