package co.edu.extend;

//자식 클래스
public class DmbCellPhone extends CellPhone {

	// field
	public int channel;

	// 생성자
	// 부모 클래스에 생성자가 없어서 써줌
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;

		// 부모 클래스에 생성자가 있을 경우 위가 아닌 super로 써야함
		// public DmbCellPhone(String model, String color, int channel) {
		// super(model,color);
	}

	// 메소드

	void turnOnDmb() {
		System.out.println("채널 :" + channel + "Dmb 시작");
		super.powerOn();
	}

	void turnOffDmb() {
		System.out.println("Dmb 종료");

	}

	
	// 부모 클래스의 메소드를 원하는걸로 바꿔서 실행
	@Override
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다");
	}

}
