package com.biz.classes.model;

public class AddressVO {
	
	public String strName;
	public String intTel;
	public String strAddr;
	public String strRela;
	
	public void info() {
		System.out.println("이름 : " + strName);
		System.out.println("전화번호 : " + intTel);
		System.out.println("주소 : " + strAddr);
		System.out.println("관계 : " + strRela  );
		
	}
	

}
