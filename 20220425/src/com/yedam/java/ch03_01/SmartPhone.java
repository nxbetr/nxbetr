package com.yedam.java.ch03_01;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {// 부모클래스에 생성자가 따로 명시되어 있지 않더라도 만들어야함
		super(owner); // 상속 관계에서는 super를 통해 부모클래스 생성자를 제일 먼저 호출해야 한다
	}

	public void inernetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
