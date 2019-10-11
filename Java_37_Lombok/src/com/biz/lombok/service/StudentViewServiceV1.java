package com.biz.lombok.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Setter;

@Setter
public class StudentViewServiceV1 extends StudentViewServiceABS {

	List<StudentVO> stdList;

	public StudentViewServiceV1() {
		stdList = new ArrayList<StudentVO>();
	}

	@Override
	public void view() {
		System.out.println("===================================================");
		System.out.println("학생정보");
		System.out.println("===================================================");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("---------------------------------------------------");
		for (StudentVO vo : stdList) {
			System.out.print(vo.getS_num() + "\t");
			System.out.print(vo.getS_name() + "\t");
			System.out.print(vo.getS_tel() + "\t");
			System.out.print(vo.getS_dept() + "\t");
			System.out.print(vo.getS_addr() + "\n");
		}
		System.out.println("===================================================");

	}

	@Override
	public void search(String strName) {
		for (StudentVO vo : stdList) {
			if (vo.getS_name().contains(strName))
				this.view();
		}
	}

	@Override
	public void search(int intGrade) {
	}

	@Override
	public void search(int grGrade, int lessGrade) {
		for (StudentVO vo : stdList) {
			int dept = Integer.valueOf(vo.getS_dept());
			if (dept >= grGrade && dept <= lessGrade) {
				this.view();
			}
		}
	}

}