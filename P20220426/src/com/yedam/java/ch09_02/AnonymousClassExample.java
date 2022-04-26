package com.yedam.java.ch09_02;

public class AnonymousClassExample {

	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass();
	
		//익명 객체를 필드로 사용
		//ac.를 통해 변수로 필드 접근 후 상수 호출
		ac.rc.turnOn();
		System.out.println();
		
		//익명 객체를 로컬변수로 사용
		//메소드를 호출
		ac.method1();
		System.out.println();
		
		//익명 객체를 매개변수로 사용
		//매개변수가 필요한 메소드를 호출
		// 내부에 new 연산자를 사용해 인터페이스를 대신해서 사용
		ac.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");     // ->필요한 내용을 여기에 작성
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}

}
