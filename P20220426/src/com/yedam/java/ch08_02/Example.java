package com.yedam.java.ch08_02;

public class Example {
	//Implementation Example
	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();
		//직접적 관계가 없지만 자동 상속이 됨
		
		//대신 ia. 했을 때 methodA만 있음, 접근이 가능한게(실행 가능한게) methodA만 있다는 뜻
		InterfaceA ia = impl;
		ia.methodA();
	
		//대신 ib. 했을 때 methodB만 있음, 접근이 가능한게(실행 가능한게) methodB만 있다는 뜻
		InterfaceB ib = impl;
		ib.methodB();
	
		
		//InterfaceC에서 AB 모두 상속 중이라 모두 실행가능 
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
