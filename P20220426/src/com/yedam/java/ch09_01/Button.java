package com.yedam.java.ch09_01;

public class Button {
	//필드로 인터페이스를 가짐
	OnClickListener listener;
	
	//생성자가 아니라 세터를 이용해 입력
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	
	//Button과 직접적으로 연관된 거라 내부에 만듦
	static interface OnClickListener {
		void onClick();
		
	}
	
}
