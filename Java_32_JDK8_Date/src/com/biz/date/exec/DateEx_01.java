package com.biz.date.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {
	public static void main(String[] args) {

		Date date = new Date(System.currentTimeMillis());
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		
		String curDate = sf.format(date);
		
		SimpleDateFormat st = new SimpleDateFormat("hh:mm:ss");
		
		String curTime = st.format(date);
		
		System.out.println("오늘 : " + curDate);
		System.out.println("현재시간 : "+ curTime);
		
	}
}
