package co.edu.oop;

public class Person {
// 1 필드
	// 주민번호 이름 주소 나이
	String num;
	String name;
	String add;
	int age;

	// 기본 생성자 (필드 초기화x)
	public Person() {
	}

	// 주민번호 이름 주소 나이를 매개변수로
	public Person(String num, String name, String add, int age) {
		this.num = num;
		this.name = name;
		this.add = add;
		this.age = age;

	}

	void introduce() {
		
		int num = 45345;
		System.out.println(num);
		String name = "김자바";
		System.out.println(name);
		String add = "서울";
		System.out.println(add);
		int age = 13;
		System.out.println(age);

// 메소드

// introduce "Person[name:Jhone, age:20]
// 세명 객체 만들고 메소드 int를 호출하여 출력
	}
}
