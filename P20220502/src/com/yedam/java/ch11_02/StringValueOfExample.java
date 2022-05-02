package com.yedam.java.ch11_02;

public class StringValueOfExample {

	public static void main(String[] args) {
		//String 외의 타입을 String으로 바꾸는 것
		
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		
		//정석대로 변환
		 //정적메소드라 인스턴스 필요없음
		String intStr = String.valueOf(intValue);   
		String doubleStr = String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);
		
		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);
		
		//편번으로 변환
		//두개 중 하나라도 문자열이면 문자열 결합이 되는걸 이용
		System.out.println(""+intValue);
		System.out.println(""+doubleValue);
		System.out.println(""+booleanValue);
	}

}
