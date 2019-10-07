package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {
	
	public static void main(String[] args) {
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println("올해 : " + local.getYear());
		System.out.println("이달 : " + local.getMonth());
		System.out.println("오늘 : "+ local.getDayOfYear());
		
		System.out.printf("%02d:%02d:%02d\n",
				local.getHour(),local.getMinute(),local.getSecond());
		local.plusDays(3);
		System.out.println(local.plusDays(3).toString());
		System.out.println(local.minusDays(3).toString());
		
		System.out.println(local.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(local.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
		System.out.println(local.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
		System.out.println(local.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));
		
		LocalDateTime makeDateTime = LocalDateTime.now();
		
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(9);
		makeDateTime = makeDateTime.withDayOfMonth(29);
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		System.out.println(makeDateTime.toString());
		
		int curMonth = LocalDateTime.now().getMonthValue();
		int p3Month = LocalDateTime.now().plusMonths(3).getMonthValue();
		System.out.printf("%d-%d=%d\n",p3Month,curMonth, p3Month-curMonth);
	}
}
