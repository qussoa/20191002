package com.biz.classes.student;

public class StudentExec_01 {
	
	public static void main(String[] args) {
		//Student class활용 코드 작성
		
		Student student = new Student();
		
		student.strNum = "001";
		student.strName = "박지민";
		student.intrYear = 2012;
		student.strDept = "영영";
		
		student.viewInfo();
		
		student.list();

	
	}
}
