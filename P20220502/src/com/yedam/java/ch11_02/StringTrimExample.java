package com.yedam.java.ch11_02;

public class StringTrimExample {

	public static void main(String[] args) {
		// 공백을 제거하는 메소드(자바는 공백을 인식함.)
		// 앞뒤 공백만 제거하고 중간에 있는 공백은 제거하지 못함

		String tel1 = "   02";
		String tel2 = "123      ";
		String tel3 = "    1234    ";

		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel1 + tel2 + tel3);   //수정안함
		System.out.println(tel);   //수정함
	}
}



// trim을 해도 기존에 있는 걸 제거하는게 아님