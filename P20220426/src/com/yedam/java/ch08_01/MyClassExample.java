package com.yedam.java.ch08_01;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)---------------");
		MyClass myClass1 = new MyClass();  //매개변수가없음
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)---------------");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)---------------");
		MyClass myClass3 = new MyClass(); //매개변수가없음
		myClass3.methodA();
		
		System.out.println("4)---------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
	}

}                   // 내 답
					//1)------------------
					//TV를 켭니다
					//현재 TV 볼륨 : 5 
					//
					//2)------------------
					//TV를 켭니다  ->오디오로 고쳐야함
					//현재 Audio 볼륨 : 5
					//
					//3)------------------
					//TV를 켭니다  ->오디오로 고쳐야함
					//현재 Audio 볼륨 : 5
					//
					//4)------------------
					//TV를 켭니다
					//현재 TV 볼륨 : 5



