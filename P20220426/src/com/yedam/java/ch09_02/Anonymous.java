package com.yedam.java.ch09_02;

public class Anonymous {

	// 필드, 초기값으로 대입
	Person field = new Person() { // 익명객체
		// 클래스기 때문에 필드 메소드 모두 가질수 있음

		// 메소드
		void work() {
			System.out.println("출근합니다");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	};

	// 로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();    //super.wake();에 내가 추가한 walk();를 적어주면 됨
			}
		};
		localVar.wake();  //적어주지 않으면 사라짐
	}
	
	void method2(Person person) {
		person.wake();
	}
}
