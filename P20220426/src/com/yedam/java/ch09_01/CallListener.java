package com.yedam.java.ch09_01;

import com.yedam.java.ch09_01.Button.OnClickListener; //OnClickListener가 뭔지 알려주기 위해 import를 사용

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
	
}
