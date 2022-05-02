package com.yedam.java.ch11_02;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		// 대소문자를 구분하는 메소드 
		
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));   // 결과값은 false, 논리적으로 같다해도 대소문자를 구분해서 다르다고 인식함
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();     // 둘 다 소문자로 변형
		System.out.println(lowerStr1.equals(lowerStr2));   //결과값 true
		
		System.out.println(str1.equalsIgnoreCase(str2));  // true. 대소문자 구분없이 논리값만 계산해서 알려주는 메소드

	}

}
