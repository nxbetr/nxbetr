package co.edu.oop;

public class Calculator2Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		//메소드에서 메소드 호출
		cal.execute();
		cal.avg(10, 2);
		double avg = cal.avg(10, 2);
		System.out.println(avg);
	
	Calculator3 myCalcu = new Calculator3();
	double result1 = myCalcu.areaRectangle(10);
	double result2 = myCalcu.areaRectangle(10,20);
	System.out.println("정사각형의 넓이 :" + result1);
	System.out.println("직사각형의 넓이 :" + result2);
	}

}
