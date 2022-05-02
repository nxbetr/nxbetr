package com.yedam.java.ch11_03;

public class MathClassExample {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1);	
		System.out.println("v2 : " + v2);
		
		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);
		
		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		
		//최대값. 두개의 값 중 큰 값을 넘겨받음
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		
		//최소값. 두개의 값 중 작은 값을 가지고 옴
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		
		//랜덤값. 0.0 부터 1.0까지를 호출할 수 있음
		double v11 = Math.random();
		System.out.println("v11 : " + v11);
		
		
		// 가까운 정수의 실수값. 반올림의 개념과 비슷하게 보면 됨. 소숫점 이하 첫번쨰에서 값을 봄
		double v12 = Math.rint(5.3);   // -> 5에 가까움
		double v13 = Math.rint(5.7);   // -> 6에 가까움
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);
		
		
		//반올림값. 소숫점 이하 첫째자리
		// rint와의 차이 : rint는 double, 실수타입. 
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 : " + v14);
		System.out.println("v15 : " + v15);
		
		
		//반올림값. 소수점 이하 세번째자리 반올림을 하고싶다면
		double value = 12.3456;
		double temp1 = value * 100;   // ->1234.56 을 만들어줌
		long temp2 = Math.round(temp1);  // 결과값으로 1235.0이 나옴
		double v16 = temp2 / 100.0; //다시 소수점 이하를 앞으로 당겨줌. temp2는 정수타입이라 하나는 실수타입으로(100.0) 변환해야함
		System.out.println("v16 : " + v16);
		
		
		// rint() 와 round() 차이
		
		// 1. 양수일 땐 둘 다 소수점 이하 첫번쨰에서 값을 봄
		//2. rint는 정 중앙의 값일때(x.5) 일반적으로 아는 반올림과 달리 짝수값으로 넘어감. 0과 1 두 수의 중앙이니까 짝수 0으로 감
		System.out.println("round(0.5) : " + Math.round(0.5));
		System.out.println("rint(0.5) : " + Math.rint(0.5));
		
		System.out.println("round(1.5) : " + Math.round(1.5));
		System.out.println("rint(1.5) : " + Math.rint(1.5));
		
		
		// 
		
	}

}
