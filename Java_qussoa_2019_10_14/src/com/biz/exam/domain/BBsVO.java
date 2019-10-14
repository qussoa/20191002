package com.biz.exam.domain;

public class BBsVO {

	private int seq;
	private int date;
	private String auth;
	private String subjeck;
	private String text;
	private int count;
 
 
public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public String getAuth() {
	return auth;
}
public void setAuth(String auth) {
	this.auth = auth;
}
public String getSubjeck() {
	return subjeck;
}
public void setSubjeck(String subjeck) {
	this.subjeck = subjeck;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}

@Override
public String toString() {
	return "BBsVO [seq=" + seq + ", date=" + date + ", auth=" + auth + ", subjeck=" + subjeck + ", text=" + text
			+ ", count=" + count + "]";
}
 
 
}
