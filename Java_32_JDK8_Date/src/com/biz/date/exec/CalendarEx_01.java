package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {
public static void main(String[] args) {
	
	Calendar calendar = Calendar.getInstance();
	
	System.out.println("올해 : " + calendar.get(Calendar.YEAR));
	System.out.println("이달 : " + calendar.get(Calendar.MONTH));
	System.out.println("오늘 : " + calendar.get(Calendar.DAY_OF_MONTH));
	System.out.println("시 : "+ calendar.get(Calendar.HOUR_OF_DAY));
	System.out.println("시 : " + calendar.get(Calendar.HOUR));
	System.out.println("분 : " + calendar.get(Calendar.MINUTE));
	System.out.println("초 : " + calendar.get(Calendar.SECOND));
	System.out.printf("%02d:%02d:%02d",calendar.get(Calendar.HOUR_OF_DAY),
	calendar.get(Calendar.MINUTE),	calendar.get(Calendar.SECOND));
}
}
