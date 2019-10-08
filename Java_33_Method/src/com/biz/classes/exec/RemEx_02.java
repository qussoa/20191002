package com.biz.classes.exec;

import com.biz.classes.service.children.RadioClassV2;
import com.biz.classes.service.children.TvClassV2;
import com.biz.classes.service.parents.RemoconABSV2;

public class RemEx_02 {
	public static void main(String[] args) {
		
		TvClassV2 tv1 = new TvClassV2();
		
		RemoconABSV2 tv = new TvClassV2();
		RemoconABSV2 radio = new RadioClassV2();
		
		tv.setName("TV");
		tv.power();
		tv.volUp();
		tv.volDown();
		tv.ChUp();
		tv.ChDown();
		
		radio.power();
		
	}
}
