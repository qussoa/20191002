package com.biz.gp.domain;

public class StudentVO {

	/*
	 * 정보은닉
	 * 클래스의 필드를 private 설정하는 것
	 * 외부에서 필드에 직접 접근 못하도록 막는 것
	 * 
	 * 캡슐화 
	 * 클래스내부에서 어떤 일이 일어나는지 외부에서는 몰라도 된다
	 * getter() setter() 외부에서 간접적으로 접근할 수 있는 통로를 설정
	 * 단순히 접근 통로 뿐 아니라 내부에서 필드에 어떤 연산을 수행하고
	 * 값을 변경한 후 외부에 노출하거나
	 * 
	 * 외부에서 주입되는 값을 검증하는 코드를 추가하여
	 * 논리적으로 잘못된 데이터가 칠드변수에 추가되는 것을 막는일
	 * 
	 * 정보은닉과 캡슐화를 하고 나면 많은 양의 데이터를 VO를 통해서 처리를 하려면
	 * 어떤 값을 VO에 담아서  List 추가하는 일 객체를 생성하고, getter를 이용
	 * 데이터를 필드변수에 값을 입력하는 일을 한다 
	 * 이 방식이 상당히 번거롭게 작용하는 경우도 있다
	 * getter() method를 이용할 시 생기는 불편함을 보완하기 위해
	 * 생성자에 값을 주입하고 객체를 생성하는 방법 
	 */
	private String st_Num;
	private String st_Name;
	private String st_Tel;
	private String st_Addr;
	private int st_Grade;
	private String st_Dept;
	
	
	public StudentVO() {
		super();
	}
	public StudentVO(String st_Num, String st_Name, String st_Tel, String st_Addr, int st_Grade, String st_Dept) {
		super();
		this.st_Num = st_Num;
		this.st_Name = st_Name;
		this.st_Tel = st_Tel;
		this.st_Addr = st_Addr;
		this.st_Grade = st_Grade;
		this.st_Dept = st_Dept;
	}
	public String getSt_Num() {
		return st_Num;
	}
	public void setSt_Num(String st_Num) {
		this.st_Num = st_Num;
	}
	public String getSt_Name() {
		return st_Name;
	}
	public void setSt_Name(String st_Name) {
		this.st_Name = st_Name;
	}
	public String getSt_Tel() {
		return st_Tel;
	}
	public void setSt_Tel(String st_Tel) {
		this.st_Tel = st_Tel;
	}
	public String getSt_Addr() {
		return st_Addr;
	}
	public void setSt_Addr(String st_Addr) {
		this.st_Addr = st_Addr;
	}
	public int getSt_Grade() {
		return st_Grade;
	}
	public void setSt_Grade(int st_Grade) {
		this.st_Grade = st_Grade;
	}
	public String getSt_Dept() {
		return st_Dept;
	}
	public void setSt_Dept(String st_Dept) {
		this.st_Dept = st_Dept;
	}
	 
}
