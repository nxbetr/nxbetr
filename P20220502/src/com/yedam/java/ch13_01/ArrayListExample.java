package com.yedam.java.ch13_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java"); // add를 사용하면 값이 차례대로 끝에 계속 추가됨
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 앞 숫자는 인덱스 위치
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2); // 값이 제대로 들어갔다면 인덱스 2를 지정했을때 위에서 입력했던 Database가 출력돼야 함
		System.out.println("2 : " + skill);
		System.out.println();

		
		// list 내부의 정보 꺼내 오는 법
		// get을 통해 i번째 값을 하나씩 꺼내오는 방법
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); 
			System.out.println(i + " : " + str);
		}
		System.out.println();

		
		// 향상된 for문을 통해 출력하는 방법
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		
		//값을 삭제
		list.remove(2);   //두번째 인덱스(Database) 삭제
		list.remove(2);	  // 위에서 두번째 인덱스 삭제 후 당겨진 두번째 인덱스(Servlet/JSP) 삭제
		list.remove("iBATIS");  // iBATIS를  지정해서 삭제
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); 
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		
	}

}
