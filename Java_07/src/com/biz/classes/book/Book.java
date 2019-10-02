package com.biz.classes.book;

public class Book {
	
	public String strName;
	public String strPub;
	public String strWrit;
    public int intPrice;
    
    public void bookInfo() {
    	
    	System.out.println("책이름 : " + strName);
    	System.out.println("출판사 : " + strPub);
    	System.out.println("저자 : " + strWrit);
    	System.out.println("가격 : " + intPrice);
    	

    	}
    
	public void list() {
		System.out.printf("%s\t %s\t %s\t %d\n",
				strName, strPub, strWrit, intPrice);
		
    }
}
