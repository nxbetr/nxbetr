package com.yedam.java.ch08_01;

public interface RemoteControl {

	// 상수필드
	public static final int MAX_VOLUME = 10;  //상수는 변수명을 대문자로 해야함
	int MIN_VOLUME = 0; // 생략했지만 이 앞에 public static final이 있다

	// 추상 메소드
	public abstract void turnOn();
	void turnOff(); // 생략했지만 이 앞에 public abstract final이 있다
	public void setVolume(int volume);

}
