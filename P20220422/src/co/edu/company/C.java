package co.edu.company;

import co.edu.ass.A;

public class C extends A{  //C클래스는 자식클래스

	public static void main(String[] args) {

		A a = new A();
		int temp;

		// 1. default
		// default a 는 같은 패키지가 아니라 오류
		//temp = a.a;

		// public
		temp = a.b;
		
		//protected
		// 위에 extends A를 해서 protected 클래스 사용가능
		C c = new C();
		int d = c.c;
		
	}

}
