package co.edu.extend;

//자식 클래스
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("자식 클래스에서 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
