package com.biz.list.service;
/**
 * 
 * @author 505-13
 *
 *@version 2
 *처음 설계당시에 없던 input(int count)를 추가한다
 *intput(int count) method는 다수의 도서정보를 입력받을떄 
 *사용할 method로 설정한다
 */
public interface BookService {

	public void input(int count);
	public void input();
	public void list();
	public void view(int index);
	
	public void view(String strName);
	
}
