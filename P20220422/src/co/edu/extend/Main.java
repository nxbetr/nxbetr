package co.edu.extend;

public class Main {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("고아라폰", "white", 100);

		// 부모클래스 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangUp();

		// 자식 클래스 메소드
		// 자식 클래스에 없는 메소드이지만 부모클래스를 상속 받아서 사용할 수 있다
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();

		// 부모클래스 메소드
		dmbCellPhone.powerOff();

		System.out.println(dmbCellPhone.color);
		System.out.println(dmbCellPhone.model);
		
		
		// 부모클래스 
		Calculator cal = new Calculator();
		cal.areaCircle(50);
		
		//자식클래스
		Computer com = new Computer();
		com.areaCircle(60);
		
		//클래스 간 자동 타입 변환
		Member mem = new Person();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
