package com.biz.lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
/*
 * lombok.jar(롬복프로젝트)
 * domain, model 클래스에서 getter() setter() toString()
 * 생성자등의 코드를 번거롭게 작성할 필요없이 자동으로 생성해주는 3rd party library이다
 * 
 * 이클리스와 같은 IDE에서는 일단 agent(plug in)을 설치해주고
 * 프로젝트에서는 build path에서 lombok.jar파일을 add해서 사용할 수 있다
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Annotation
 * java화장 키워드
 * @Keyword라고 작성하면
 *  Java 컴파일러는 해당 키워드로 작성된 
 *  클래스를 가져다가 코드를 완성해서 컴파일을 시켜준다
 *  
 */
@Getter
@Setter
@ToString
@AllArgsConstructor // 필드생성자
@NoArgsConstructor 	// 기본생성자
@Builder			// 빌더패턴
public class StudentVO {

	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;
	private String s_dept;
	
	
	
	
}
