package com.yedam.java.h01;

public class ArcadeGame implements Keypad {
	//키패드에 등록된 상수와 같은 타입을 해야해서 int를 함
	private int currentMode;
	
	//생성자를 통한 값을 초기화
	public ArcadeGame() {
		this.currentMode = Keypad.NORMAL_MODE;
		System.out.println("ArcadeGame 실행");
	}
	
	

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		switch (this.currentMode) {
		case Keypad.NORMAL_MODE:
			System.out.println("캐릭터가 일반 공격.");
			break;
		case Keypad.HARD_MODE:
			System.out.println("캐릭터가 연속 공격.");
			break;
		}
	}

	@Override
	public void rightDownButton() {
		switch (this.currentMode) {
		case Keypad.NORMAL_MODE:
			System.out.println("캐릭터가 HIT 공격.");
			break;
		case Keypad.HARD_MODE:
			System.out.println("캐릭터가 Double HIT 공격.");
			break;
		}
	}

	@Override
	public void changeMode() {
		switch (this.currentMode) {
		case Keypad.NORMAL_MODE:
			this.currentMode = Keypad.HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
			break;
		case Keypad.HARD_MODE:
			this.currentMode = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
			break;
		}

	}

}
