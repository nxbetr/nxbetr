package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Set;

public class HashSetMemberExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 30)); // set컬렉션은 중복을 허용하지 않음
		set.add(new Member("홍길동", 30));  

		System.out.println("총 객체 수 : " + set.size());
	}

}

// set 컬렉션은 중복을 하지 않으니 
//논리적인 값이 같도록 override를 해야함