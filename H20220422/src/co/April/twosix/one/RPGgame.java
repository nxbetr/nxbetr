package co.April.twosix.one;

public  class RPGgame implements Keypad {
	// 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
	public RPGgame() {
		System.out.println("RPG game 실행");}
	Keypad keypad = new Keypad() {
	
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
		//- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
		//- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
	}
	@Override
	public void rightDownButton() {
		
		
		
		//- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
		//- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
	}
	@Override
	public void changeMode() {
		
		//모드를 바꾸고 현재 모드를 출력하는 기능 
		//( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	}

};
	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		
	}



}


