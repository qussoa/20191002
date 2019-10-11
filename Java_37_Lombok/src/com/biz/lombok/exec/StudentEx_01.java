package com.biz.lombok.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StudentVO sVO = new StudentVO();
		sVO.setS_num("001");
		sVO.setS_name("홍길동");
		sVO.setS_tel("010-222");
		
		System.out.println(sVO.toString());
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		stdList.add(StudentVO.builder().s_num("001").build());
		stdList.add(StudentVO.builder().s_num("001").s_name("이몽룡").build());
		stdList.add(StudentVO.builder().s_num("001").s_tel("010-555").build());
		
	}
}
