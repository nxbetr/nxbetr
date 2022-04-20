package co.edu.oop;

public class School {

	public static void main(String[] args) {
//      (클래스) (변수)
		Student std = new Student(); //객체를 만듦 
		//Student타입 new Student를 통해 std를 초기화
		std.name = "고길동";
        std.age = 20;
        std.getInfo();
		
		//int value = 1; -> 변수를 만들면서 데이터를 바로 넣어줌
	}

}
