package co.edu.oop;

public class Student {
	
	//필드 , 학생을 구성하기 위해 필요한 정보
	String name;
	int age;
	int kor;
	int eng;
	int math;
	//int fieldName;
	
	
	//생성자 , 객체를 만들기 위해 필요한 구문 , class 이름과 똑같이 만들어야 함
	public Student() {
	}
	//ClassName(){...}
	
	
	//메소드(함수), 설계도에서 사용되는 기능
	void getInfo() {
		System.out.println("학생의 이름 :" + name + "\n나이 :" + age);
	//void methodName(){...}	
	}
	
}





















