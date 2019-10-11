package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx_02 {
public static void main(String[] args) {
	
	List<StudentVO> stdList = new ArrayList<StudentVO>();

	System.out.println(System.currentTimeMillis());
	//객체를 생성하고, setter로 필드값을 주입한후 List저장
		for(long i =0; i<1000000;i++) {
			StudentVO stdVO = new StudentVO();
			stdVO.setSt_Num(String.format("%05d", i));
			stdList.add(stdVO);
		}
		System.out.println(System.currentTimeMillis());

		// field생성자에 값을 주입하면서 직접 add() method 주입
		for(long i =0; i<1000000;i++) {
		
			stdList.add(new StudentVO(String.format("%05d", i),"","","",0,""));
		}
		System.out.println(System.currentTimeMillis());

}
}
