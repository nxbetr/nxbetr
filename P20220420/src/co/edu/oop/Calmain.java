package co.edu.oop;

public class Calmain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.x = 5; // 계산기에 데이터를 넣는 법
		cal.y = 2;

		cal.plus(10, 2); // 계산기의 덧셈을 사용하며 값을 넣어줌
		cal.minus(100, 2);
		cal.multi(124, 23);
		cal.div(87, 3);

	}

}
