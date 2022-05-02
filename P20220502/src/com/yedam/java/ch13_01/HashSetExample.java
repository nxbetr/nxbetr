package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// String은 hash code 와 equals가 override 됨
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // ->값이 들어가지 못함
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println(); // add 메소드를 호출한건 총 다섯번이지만 중간에 중복되는 값이 있어서 출력 값이 네번. 기존의 값을 그대로 두고 중복되는 값은 들어가지
								// 못함

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { // has next에서 true이면 next에서 값을 가져 나옴
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		//제거. 식별하는게 없어서 객체값을 제거해야 함
		//내가 제거하려는 값을 정확히 알고 있어야 제거가 가능함. 대소문자 구별함
		set.remove("JDBC");
		set.remove("iBATIS");
	
		System.out.println("총 객체 수 : " + set.size());   // 2 출력
		
		for(String str : set) {
			System.out.println("\t"+str);
			
			
			//모두 지울때
			set.clear();
			if(set.isEmpty()) {  // 반환값이 true면 비어있다는 뜻
				System.out.println("비어 있음.");
			}
		}
	}

}
