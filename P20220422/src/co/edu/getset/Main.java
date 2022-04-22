package co.edu.getset;

public class Main {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		int speed = myCar.getSpeed();
		
		System.out.println(speed);
		
		//50mile 속도를 넣음
		//myCar.setSpeed(50);
		// 50mile이 km로 변환된 값을 구하려면
		//speed = myCar.getSpeed();
		//System.out.println(speed);
		
	}

}
