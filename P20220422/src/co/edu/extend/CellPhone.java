package co.edu.extend;
//부모클래스
public class CellPhone {

	
	//field
	public String model;
	public String color;
	
	
	//생성자
	// 1.DmbCellPhone(자식클래스 기준 생성자가 없음)
	
	//2. 아래처럼 생성자를 만든 경우 DmbCellPhone에서 super를 써준다
//	public CellPhone(String mode, String color) {
//		this.model=model;
//		this.color=color;
	
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

	void bell() {
		System.out.println("벨이 울립니다");
	}

	void hangUp() {
		System.out.println("전화를 끊습니다");
	}


}
