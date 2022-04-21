package co.edu.oop;

public class Calculator {

	//필드
	
	
	//생성자
	
	
	//메소드
	
	void execute() {
		powerOn();
	
		
	}
	
	double avg(int x , int y) {
		int sum = plus (x,y);
		double result = (double) sum/2;
		return result;
	}
	
	
	
	
	void powerOn() {  // return을 사용하지 않을 때 void 를 사용한다
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	int minus(int x, int y) {
		int result = x-y;
		return result;
	}
}
