package co.April.twosix.one;

public class ArcadeGame implements Keypad {
//	public ArcadeGame() {
//		System.out.println("Arcade game 실행");}
	//매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다.
	public int AcdowMode = 0;
	
	@Override
	public void leftUpButton() {
System.out.println("캐릭터가 앞쪽으로 이동한다");

	}

	@Override
	public void leftDownButton() {
System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void changeMode() {
		if(AcdowMode ==0) {
			this.AcdowMode = 1;
			this.AcdowMode = Keypad.HARD_MODE;
			System.out.println("현재모드: HARD_MODE");
		}else if(AcdowMode == 1) {
			this.AcdowMode = 0;
			this.AcdowMode = Keypad.NORMAL_MODE;
			System.out.println("현재모드: NORMAL_MODE");
		}
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		
	}


		
	}
	

	


