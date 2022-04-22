package co.edu.extend;

//자식 클래스
public class SuperSonicAirPlane extends AirPlane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다");
		} else { // 아니라면 부모 메소드 부름
			super.fly();
		}
	}

}
