package co.April.twosix.one;

public abstract class ArcadeGame implements Keypad {
//	public ArcadeGame() {
//		System.out.println("Arcade game 실행");}
	//매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다.
	
	@Override
	public void leftUpButton() {
System.out.println("캐릭터가 앞쪽으로 이동한다");

	}

	@Override
	public void leftDownButton() {
System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}


	}


