package ch05homework;

import java.util.Calendar;

import ch05homework.Week.week;

public class EnumWeekExample {
	
	public static void main(String[] args)
	{
		week today = null;
		
		Calendar cal = Calendar.getInstance();
		int weeks = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(weeks)
		{
		case 1:
			today = week.SUNDAY;
			break;
		case 2:
			today = week.Monday;
			break;
		case 3:
			today = week.Tuesday;
			break;
		case 4:
			today = week.WEDNESDAY;
			break;
		case 5:
			today = week.THURSDAY;
			break;
		case 6:
			today = week.FRIDAY;
			break;
		case 7:
			today = week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일" + today);
		if(today==week.SUNDAY)
		{
			System.out.println("일요일엔 축구합니다");
		}else
		{
			System.out.println("열심히 자바공부합니다");		
		}
	}


}
