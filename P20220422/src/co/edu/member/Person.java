package co.edu.member;

public class Person {

	// field
	final String nation = "Korean";
	final String ssn;
	String name;

	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public void info() {
		System.out.println(nation + "," + ssn);
	}

}