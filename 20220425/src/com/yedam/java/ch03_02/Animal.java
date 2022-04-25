package com.yedam.java.ch03_02;

public abstract class Animal {   //추상 메소드가 있는 클래스는 반드시 추상클래스로 만들어야함, 추상클래스에 추상메소드가 없는건 가능함

	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
// 동물들이 내는 소리는 각각 달라서 추상 메소드로 만듦
}
