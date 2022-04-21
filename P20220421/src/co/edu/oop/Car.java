package co.edu.oop;

public class Car {

	// 필드(속성)
	String company;
	String model;
	String color;
	int maxSpeed;

	// 생성자(객체 초기화)
	// ()안에 들어오는 값에 따라 같은 생성자 이름으로Car여러개 생성 가능
	public Car() { // 데이터가 안들어간 생성자
	}

	public Car(String a, String b) { // 모델과 컬러 데이터가 들어간 생성자
		this.model = a; // 밖에서 가져온 데이터를 변수에 넣는 것
		this.color = b;
		// this.model은 클래스에서 사용되는 변수, 위의 String model= model;의 model
		// a는 밖에서 가져온 데이터를 변수에 넣는 것
	}

	public Car(String a) {
		this.model = a;
	}

	// 메소드(기능)
	void info() {
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대 속도 : " + maxSpeed);
	}

}
