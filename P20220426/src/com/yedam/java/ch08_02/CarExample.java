package com.yedam.java.ch08_02;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("=================================");
		
		//앞바퀴를 금호로 교환
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
