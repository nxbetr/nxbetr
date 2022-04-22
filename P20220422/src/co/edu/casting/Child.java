package co.edu.casting;

public class Child extends Parent {

	@Override
	void method2() {
		System.out.println("child - method2");
	}   //Parent를 extends 했지만 결과는 override 된 child - method2가 출력됨
	
	void method4() {
		System.out.println("child - method4");
		// 실제 사용 될 method는 Parent 라서 Parent에 없는 method4는 출력되지 않는다
		
		
	}
}
