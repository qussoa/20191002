package com.biz.grade.exec;

public class StringComp {

	public static void main(String[] args) {

		int sort = "A".compareTo("A");
		System.out.println(sort);
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		System.out.println("F".compareTo("A"));
	}

}
