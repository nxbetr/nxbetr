package com.yedam.java.ch03_02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override // class 생성 때 브라우즈에서 설정하면 자동으로 생성됨
	public void sound() {
		System.out.println("멍멍");
	}

}
