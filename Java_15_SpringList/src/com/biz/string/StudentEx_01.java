package com.biz.string;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {

		StringService stService = new StudentServiceV1();
		
		stService.input();
		stService.list();
		
		// StudentServiceV1 클래스에 StringService interface에 정의되지 않은
		// search() method가 있는것을 사용하기 위해 
		// stService를 잠시 StudentServiceV1인 것처럼 바꾸는 것
		StudentVO stdVO =
		((StudentServiceV1)stService).serch("00005");
		
		//search() method를 호출하면서 학번 00001을 매개변수를 전달하였고
		// 만약 해당 학번의 데이터가 있으면 
		// stdVO 학생정보고 담겨있을 것이다
		// 혹시 데이터를 못찾았으면 stdVO null값이 담겨있을 것이다 
		if(stdVO == null) {
			System.out.println("찾는 data 없음");
			}else {
				System.out.println(stdVO.toString());
			}
	}

}
