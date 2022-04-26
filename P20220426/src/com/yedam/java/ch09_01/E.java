package com.yedam.java.ch09_01;

public class E {       	//바깥 클래스
	
	//필드
	//인스턴스 필드, 인스턴스 정적 둘 다 가능
	F f = new F();
	G g = new G();
	
	//정적 필드, 정적 멤버 클래스만 사용가능 (인스턴스 멤버 클래스는 불가)
	static	G g1 = new G();
	//static F f1 = new F();   -> F가 인스턴스 멤버라 사용 불가
	
	
	
 	//생성자
	
	
	//메소드
	//인스턴스 메소드, 인스턴스 정적 둘 다 가능
	void method1() {
		F f = new F();
		G g = new G();
	}
	
	//정적 메소드, 정적 멤버 클래스만 사용가능 (인스턴스 멤버 클래스는 불가) 
	static void method2() {
		G g = new G();
	  //F f = new F();   -> F가 인스턴스 멤버라 사용 불가
	}
	
	
	
	//인스턴스 멤버 클래스
	//인스턴스 필드로 사용가능(정적 필드에선 불가)
	class F {}
	
	
	//정적 멤버 클래스
	//정적 멤버클래스는 인스턴스가 있어도 없어도 인스턴스 필드로 사용가능
	// 정적 필드에선 정적 멤버클래스만 사용가능
	static class G {}
	
	
}
