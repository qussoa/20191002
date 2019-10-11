package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx_01 {
	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();

		/*
		 * java Beans Pattern 자바의 고전적 패턴
		 */
		StudentVO stVO = new StudentVO();
		stVO.setSt_Num("001");
		stVO.setSt_Name("홍길동");
		stVO.setSt_Tel("010-0100-4112");
		stVO.setSt_Addr("서울특별시");
		stVO.setSt_Grade(3);
		stdList.add(stVO);

		//setter() 를 이용해서 필드에 값을 주입하고 List추가
		stVO.setSt_Num("002");
		stVO.setSt_Name("이몽룡");
		stVO.setSt_Tel("010-0102-4112");
		stVO.setSt_Addr("익산시");
		stVO.setSt_Grade(2);
		stdList.add(stVO);

		// 생성자를 이용해서 필드값을 초기화 하면서 객체를 생성하고 변수에 담았다가 List추가
		// 변수 객체에 담았다가 List 추가
		stVO = new StudentVO("003", "성춘향", "010-5451-5142", "남원시", 3, "005");
		stdList.add(stVO);

		// 별도의 변수객체를 만들지 않고 add() method 직접 생성자 코드를 작성
		// List 추가
		stdList.add(new StudentVO("004", "임꺽정", "010-5432-8587", "남원시", 2, "005"));
		
		//생성자를 이용한 객체 생성
		//1.생성자의 매개변수를 순서 등을 명확히 인식해야만 
		//  오류가 없는 값을 추가할 수 있다
		//2. 지금당장 추가하지 않아도 될 field값도 의무적으로 모두 추가해야하는 단점
	}
}
