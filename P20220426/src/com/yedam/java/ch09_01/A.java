package com.yedam.java.ch09_01;

//중첩 클래스 
public class A {           // 바깥클래스
	
	A() {System.out.println("A 인스턴스가 생성됨.");}

	
	
	// 내부클래스
	// static이 없어서 인스턴스 멤버 클래스
	//인스턴스를 생성 후 접근하냐 생성 없이 접근하냐의 차이, stastic은 인스턴스 생성없이 접근 가능해서 static이 없는 클래스는 접근할 수 없다
	// 인스턴스 클래스는 A 클래스에 대해 반드시 인스턴스가 있어야함
	class B{   //B라는 클래스에 접근하려면 A에 대한 정보가 있어야함
		B(){System.out.println("B 인스턴스가 생성됨.");}
	
		//필드 
		int field1;
	//	static int field2;
		
		
		
		//메소드
		void method1() {}
		//static void method2() {}
	}
	// 정적 멤버 클래스, static이 붙고 static이 붙거나 없는 메소드 모두를 사용가능
		static class C{
		C(){System.out.println("C 인스턴스가 생성됨.");}
		
		//필드
		int field1;
		static int field2;
		

		
		//메소드
		void method1() {}
		static void method2() {}
		}
	
	
	// 로컬 클래스
	//void method() {}
		//로컬 클래스
	
	class D { 
	D(){System.out.println("D 인스턴스가 생성됨.");}
			
			
		//필드
	int field1;
	//static int field2;
			
		//메소드
	void method1() {}
	
	//static void method2() {}
	
	
		D d =new D();
	
	}

}