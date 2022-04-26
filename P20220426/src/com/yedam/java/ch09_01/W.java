package com.yedam.java.ch09_01;

public class W {
	//필드
	int field1;
	static int field2;
	
	//메소드
	void method1() {}
	static void method2() {}
	
	
	
	//인스턴스 멤버 클래스
	class Y{
		void method() {
			field1 = 10;
			field2 = 20;
			
			method1();
			method2();
		}
	}
	// 정적 멤버 클래스
	//바깥 클래스의 정적 필드와 메소드는 사용가능하지만, 인스턴스 필드와 메소드는 사용불가
		static class Z{
		void method() {
			//field1 = 10; -> 사용불가
			field2 = 20;
			
			//method1(); -> 사용불가
			method2();
		}
	}
	
}
