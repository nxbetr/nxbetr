package co.April.twosix.one;

public  class RPGgame implements Keypad {
	// 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
	public int RPGowMode = 0;
	
	
	@Override
	public void leftUpButton() {
			System.out.println("캐릭터가 위쪽으로 이동한다");
	}
	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}
	@Override
	public void rightUpButton() {
		
		if(RPGowMode == 0) {
			this.RPGowMode = Keypad.NORMAL_MODE;
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(RPGowMode == 1) {
			this.RPGowMode = Keypad.HARD_MODE;
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}
	@Override
	public void rightDownButton() {
		//- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
		//- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
		if(RPGowMode == 0) {
			this.RPGowMode = Keypad.NORMAL_MODE;
			System.out.println("캐릭터가 일반 공격.");
		}else if(RPGowMode == 1) {
			this.RPGowMode = Keypad.HARD_MODE;
			System.out.println("캐릭터가 HIT 공격.");
		}
	}
	@Override
	public void changeMode() {
		//모드를 바꾸고 현재 모드를 출력하는 기능 
		//( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
		
		if(RPGowMode ==0) {
			this.RPGowMode = 1;
			this.RPGowMode = Keypad.HARD_MODE;
			System.out.println("현재모드: HARD_MODE");
		}else if(RPGowMode == 1) {
			this.RPGowMode = 0;
			this.RPGowMode = Keypad.NORMAL_MODE;
			System.out.println("현재모드: NORMAL_MODE");
		
		
	}

}
}
