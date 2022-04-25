package com.yedam.java.ch08_01;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();  //new Television 부분을 원하는 걸로 바꿔서 사용하면 된다
		rc.turnOn();
		rc.setVolume(20);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
	}

}
