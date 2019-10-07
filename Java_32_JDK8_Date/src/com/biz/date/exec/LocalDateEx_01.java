package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx_01 {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		DateTimeFormatter dDate 
		= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate = dDate.format(localDate);
		
		System.out.println("오늘 날짜 : " + curDate);
		
		//System.out.println(localDate);
			
			
	}
}
