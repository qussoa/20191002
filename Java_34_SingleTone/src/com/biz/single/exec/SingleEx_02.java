package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {
public static void main(String[] args) {
	SafeSingleClassV1 ssc = SafeSingleClassV1.getInstance();
	ssc.setName("홍길동");
	ssc.setNation("Republic of Korea");
	
	SafeSingleClassV1 ssc1 = SafeSingleClassV1.getInstance();
	System.out.println("너는 누구 : " + ssc1.getName());
	System.out.println("고향 어디 : " + ssc1.getNation());
}
}
