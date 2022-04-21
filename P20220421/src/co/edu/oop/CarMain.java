package co.edu.oop;

public class CarMain {

	public static void main(String[] args) {
		
		//자동차 객체 생성, 설계도를 바탕으로 자동차 객체를 만듦
		Car myCar = new Car(); //생성자에 데이터가 없어서 밑에 추가로 적어줌
		myCar.company = "기아";
		myCar.model = "k3";
		myCar.color = "white";
		myCar.maxSpeed = 150;
		
		myCar.info();
		
		System.out.println();
		System.out.println();
		
		// 생성자를 통한 데이터 입력
		Car myCar2 = new Car("sonata", "black"); //바로 데이터를 넣음
		myCar2.info();
	
	}

}
