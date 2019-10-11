package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생 보이기
 */
public class StudentEx_02 {
	public static void main(String[] args) {
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV1();

		Scanner scan = new Scanner(System.in);
		String fileName = "src/com/biz/lombok/학생정보.txt";

		try {
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();

			sView.setStdList(stdList);
			 sView.view();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			System.out.println("==================================");
			System.out.println("학생검색");
			System.out.println("==================================");
			System.out.println("1.이름 2. 학년 3.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if (intM == 0)
				break;
			if (intM == 1) {
				System.out.print("학생 이름 : ");
				String strName = scan.nextLine();
				sView.search(strName);
			} else if (intM == 2) {
				System.out.print("최저학년 : ");
				String grGrade = scan.nextLine();
				System.out.print("최고학년 : ");
				String lessGrade = scan.nextLine();
				try {
					sView.search(Integer.valueOf(grGrade), Integer.valueOf(lessGrade));
				} catch (Exception e) {
					System.out.println("숫자만 기입바람");
				}
			}
		}
		System.out.println("업무종료");
	}
}
