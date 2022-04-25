package com.yedam.java.ch02_01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override   //Tire에서 그대로 가져와서 수정할 부분만 수정(Tire 수명->HannkookTire 수명)
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRoutation) {
			System.out.println(location + " HankookTire  수명 : " 
					+(maxRoutation - accumulatedRotation) +" 회");
		return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
					return false;

		}
}
}
