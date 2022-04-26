package com.yedam.java.ch09_01;

public class AExample {

	public static void main(String[] args) {
		// A가 있는 B라는 클래스를 찾아가기 
		A a = new A();
	
		
		
		//인스턴스 멤버 클래스 객체 생성
		// A 클래스 내부에 있는 B 클래스이기 때문에 아래처럼 써야함, B는 A가 존재해야 B라는 정보를 가져와 인스턴스 생성을 할 수 있음
		A.B b = a.new B(); 
		//A.B tempB = tempA.new B(); //로도 생성가능
		b.field1 = 3;
		b.method1();
		//정적 멤버 클래스 객체 생성
	   //A라는 필드의 정적필드라 A라는 클래스에 해당하는 인스턴스가 필요없음 그래서 a.을 생략
		A.C c = new A.C();
		c.field1 = 3;
		A.C.field2 = 0 ;
		A.C.method2();
		
		
		// 로컬 클래스 객체 생성
		//a.method();   -? 오류 나서 주석처리 해둠 , 411페이지 참고
		
	}

}
