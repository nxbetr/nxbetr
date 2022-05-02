package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");  //기존 문자열을 먼저 넣고 바꾸고자 하는 문자열을 뒤에 넣음
		System.out.println(oldStr);
		System.out.println(newStr);  // 출력 : JAVA는 객체 지향 언어입니다. JAVA는 풍부한 API를 지원합니다.

	}

}

//oldStr.replace를 했지만 oldStr은 그대로 있고 동일한 이름의 새로운 String이 만들어짐, 기존 oldStr은 부를수도 없는 붕 뜬 상태(메모리 낭비)
// StringBuilder 내부에 자기만의 메모리를 가짐. replace와 다르게 실제로 수정이 일어남. 그래서 여러번 수정을 해도 객체가 하나, 빈도수가 많은 수정이라면 StringBuilder를 사용