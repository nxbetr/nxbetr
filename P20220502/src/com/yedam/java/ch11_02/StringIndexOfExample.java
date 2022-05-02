package com.yedam.java.ch11_02;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String subject1 = "JAVA PROGRAMING";
		
		int location = subject.indexOf("프로그래밍"); // subject 안에 내가 찾고자 하는 문자열이 있는지
		System.out.println(location); // 출력:3, 프로그래밍이 인덱스에서 몇번째로 시작하는지 출력, 세번쨰에 출력 된다는 뜻

		// 실제로 내가 찾고자 하는 값이 있으면 정수값을 주고 없다면 -1이라는 값을 반환 함.

		if (subject.indexOf("자바") != -1) { // 반환하는 값이 -1이 아니면 위치가 어디가 됐든 포함하고 있다는 뜻
			// indexOf 안에 영어를 넣을 땐 소문자 대문자 구분을 해줘야함
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}

	}

}
