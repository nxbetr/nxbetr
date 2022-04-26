package com.yedam.java.ch08_02;

public class ImplementationC implements InterfaceC {

	// InterfaceC만 구현 했지만 C에서 InterfaceA ,B를 상속하고 있어서 실제로는 ABC 모두를 구현해야 함
	
	
	
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

}
