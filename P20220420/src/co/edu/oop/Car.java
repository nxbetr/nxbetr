package co.edu.oop;

public class Car {

	// 필드
	int tire;
	int price;
	String color;
	String model;

	
	
	// 생성자
	public Car() {
	}

	
	
    //	각각의 변수에 바로 데이터를 만들어 넣는 법
	public Car(String a, String b, int c) {
		color = a;
		model = b;
		price = c;

	}

	// 메소드(기능)
	void info() {
		System.out.println("model = " + model);
		System.out.println("color = " + color);
		System.out.println("price = " + price);

	}

}
