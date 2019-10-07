package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {
public static void main(String[] args) {
	
	String imgSrcFile = "src/com/biz/stream/2019.png";
	String imgCopyPath = "src/com/biz/stream/";
	
	Random rnd = new Random();
	
	InputStream is = null;
	
	OutputStream os = null;
	
	try {
		is = new FileInputStream(imgSrcFile);
		
		imgCopyPath += Math.abs(rnd.nextInt())+".png";// 정수의 절대값
		
		os = new FileOutputStream(imgCopyPath);
		
		byte[] bytes = new byte[1024];
		while(true) {
		int length = is.read(bytes);
		if(length <1) break;
		
		os.write(bytes);
		
		}
		is.close();
		os.close();
		System.out.println("FileCopyOk");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
