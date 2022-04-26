package com.yedam.java.ch09_02;

public class AnonymousClass {
	//필드 초기값으로 대입
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	//로컬 변수값으로 대입, 로컬 변수값 대입을 위해서는 메소드를 선언해야함
	//메소드
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn();   //로컬 변수에서 실행되는건 내부에서만 실행되기 때문에 코드를 써줘야함
		localVar.turnOff();
	}
	
	//RemoteControl을매개변수를 가지는 메소드
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
