package com.yedam.java.ch02_01;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRoutation) {
			System.out.println(location + "KumhoTire 수명 : " 
					+(maxRoutation - accumulatedRotation) +" 회");
		return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
					return false;
}
	}
}
