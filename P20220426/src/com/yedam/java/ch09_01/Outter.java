package com.yedam.java.ch09_01;

public class Outter {
	//필드
	String field = "Outter-field";
	//메소드
	void method() {
		System.out.println("Outter-method");
	}
	
	//인스턴스 멤버 클래스
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);  // field는 우선적으로 바깥이 아닌 내부에 있는걸 먼저 찾음
			//field만 적어도 되지만 내부인걸 쉽게 알기위해 this.를 붙여 해당되는 필드의 인스턴스라는 걸 알려준다 
			this.method();
			
			//바깥에 있는 field를 사용하는 법
			System.out.println(Outter.this.field); // Outter 클래스의 인스턴스 field를 가져온다는 뜻
			Outter.this.method();
		}
	}
	
	
	
	
	
	
}






















