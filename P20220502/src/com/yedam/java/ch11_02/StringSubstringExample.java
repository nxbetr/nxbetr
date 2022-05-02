package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "123456-1234453";
		
		String firstNum = ssn.substring(0,6);  //0에서 부터 6보다 앞, 즉 5까지 잘라내겠다는 뜻
		System.out.println(firstNum);  //출력 :123456  여섯번째인 - 앞까지만 출력 됨
		
		String secondNum = ssn.substring(7); //7번부터 마지막까지 잘라내옴, 두번째 매개변수가 없으면 끝까지라는 뜻, 시작 부분은 필수로 넣어야함
		System.out.println(secondNum);
	}

}
