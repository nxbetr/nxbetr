package co.edu.casting;

public class Main {

	public static void main(String[] args) {
		
	Parent p1 = new Child();
	
	p1.method1();
	p1.method2();
	p1.method3();
	//p1.method4(); Parent 클래스에 method4가 없어서 오류 발생
	//child 를 이용해서 만든 생성자라 출력할때 child 기반으로 나오지만 child가 parent를 extends 했기 때문에
	//Parent에 있는 method가 출력되면서 Child에서 오버라이드 된 건 override된 걸로 나옴, Child에 있어도 Parent에 없는 method는 출력되지 않음
	
	
	
	
	//클래스 타입 배열
	Parent p2 = new Parent();
	Parent p3 = new Parent();
	Parent p4 = new Parent();
	
	Parent[] parent = {p2,p3,p4}; //객체가 세개 들어간 parent 타입의 배열이 만들어짐
	
//	Parent[] parent = {
//		new Parent(),
//		new Parent(),
//		new Parent()
//	};
	
	
	}
	
}
	