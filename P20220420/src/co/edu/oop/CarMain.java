package co.edu.oop;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(); // 마세라티
		Car car2 = new Car(); // 벤츠
	
		// 하나의 설계도로 여러가지 타입을 만들 수 있음

		car.model = "마세라티";
		car.color = "검은색";
		car.price = 3000;
		car.tire = 4;
		car.info();
		
		System.out.println();
		
		car2.model = "벤츠";
		car2.color = "은색";
		car2.price = 1500;
		car2.price = 8;
		car2.info();
		
		System.out.println();
		
		Car car3 = new Car("black", "그랜저", 200);
		car3.info();
	}

}
