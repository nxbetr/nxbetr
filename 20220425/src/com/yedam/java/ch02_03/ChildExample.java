package com.yedam.java.ch02_03;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		//인스턴스를 child로 선언했지만 정보는 parent에 있는지 부터 찾는다
		//parent에 정의 되어 있지 않기 때문에 사용할 수 없다
		//parent.field2 = "data2";
		//parent.method3();
		
		
		//강제로 캐스팅 변환을 하면 사용할 수 있다
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
	}

}
