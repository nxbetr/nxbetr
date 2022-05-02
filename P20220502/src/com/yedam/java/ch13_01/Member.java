package com.yedam.java.ch13_01;

public class Member {

	// 필드
	private String name;
	private int age;

	// 생성자를 통한 값을 초기화
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age; // name과 age가 동일하다면
										// 같은 hashCode를 가짐
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 같다면 강제로 타입 변환
			Member member = (Member) obj;
			return name.equals(member.name) && (age == member.age);
		} else {
			return false;
		}
	}

}
