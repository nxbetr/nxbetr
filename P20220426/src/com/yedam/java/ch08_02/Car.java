package com.yedam.java.ch08_02;

public class Car {       	//Tire를 부품으로 가지는 클래스
	
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTie = new HankookTire();
	Tire backRighTire = new HankookTire();	
	
	
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTie.roll();
		backRighTire.roll();
	}
	
	
	
	
	
	
	
	
}
