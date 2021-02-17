package ch05homework;

import java.util.Calendar;

import ch05homework.Week.week;

public class EnumMethodExample {
	
	public static void main(String[] args)
	{
		// name() �޼ҵ�
		week today = week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		// ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareto �޼ҵ夿
		week day1 = week.Monday;
		week day2 = week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		//value of�޼ҵ�
		if(args.length==1)
		{
			String strDay = args[0];
			week weekday = week.valueOf(strDay);
			if(weekday == week.SATURDAY||weekday==week.SUNDAY)
			{
				System.out.println("�ָ��̱���");
			}else
			{
				System.out.println("�����̱���");
			}
		}
		//values() �޼ҵ�
		week[] days = week.values();
		for(week day: days)
		{
			System.out.println(day);
		}
			}


}
