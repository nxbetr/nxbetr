package com.yedam.java.ch11_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 ss초"); // 소문자 대문자에 따라 뜻이 다름 ex. MM->월, mm->분
		String strDate = sdf.format(date); // 표현하고자 하는 데이트 값을 넘겨받으면 됨
		System.out.println(strDate);

	}

}
