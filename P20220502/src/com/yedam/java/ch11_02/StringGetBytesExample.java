package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		// String 생성자 : byte 타입 -> String타입 (디코딩) 컴퓨터가 인식하는걸 사람이 인식하게 변환
		// getBetes 메소드 : String 타입 -> byte타입 (인코딩) 사람이 인식하는걸 컴퓨터가 인식하는걸로 변환

		String str = "안녕하세요";

		byte[] strBytes1 = str.getBytes();
		System.out.println(strBytes1); // 출력 : [B@7d6f77cc
		String str1 = new String(strBytes1);
		System.out.println(str1); // 출력: 안녕하세요

		try {
			byte[] strBytes2 = str.getBytes("EUC-KR");
			System.out.println("strBytes2의 길이 : " + strBytes2.length);
			String str2 = new String(strBytes2, "EUC-KR"); // 정상 출력: 안녕하세요, EUC-KR이 안적으면 �ȳ��ϼ��� 라고 출력
			System.out.println("strBytes2->String : " + str2);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
