package com.yedam.java.ch08_01;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume; //volume을 field로 지정
	
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	
	@Override
	public void setVolume(int volume) {    //10보다 작으면 5 10보다 크면 10으로 출력
		if (volume >= RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume <= RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :" + this.volume);
	}
	

	public static void main(String[] args) {

	}
}