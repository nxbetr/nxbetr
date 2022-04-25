package com.yedam.java.ch02_01;

public class Tire {

	//필드 , 타이어가 가져야 하는 정보
	
	public int maxRoutation;  //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location;  //타이어의 위치
	
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRoutation = maxRotation;
	}
	
		
	//메소드
	public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRoutation) {
				System.out.println(location + "Tire 수명 : " 
						+(maxRoutation - accumulatedRotation) +" 회");
			return true;
			}else {
				System.out.println("*** " + location + " Tire 펑크 ***");
						return false;
			}
		}
	
}
