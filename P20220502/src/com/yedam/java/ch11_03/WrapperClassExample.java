package com.yedam.java.ch11_03;

public class WrapperClassExample {

	public static void main(String[] args) {
		//기본 타입의 값을 Boxing
		Integer obj1 = Integer.valueOf(300);  // () 안에는 문자열과 숫자 모두 가능
		Integer obj2 = Integer.valueOf("300");
		
		
		//Unboxing
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		
		//자동 Boxing
		Integer obj = 100;  //여기서 100은 기본타입
		System.out.println("value : " + obj.intValue());  //heap영역에 새로운 객체 생성. 기본타입 100을 넣으면 알아서 자동 Boxing이 됨
		
		
		//대입시 자동 Unboxing
		int value = obj;  //heap영역에 있는 개체의 값을 복사. obj는 class 타입이지만 오류나지 않음, obj는 지금 객체를 참고중. int value에게 넘겨주는 건 객체의 내부 값
		System.out.println("value : " + value );
		
		
		//연산시 자동 Unboxing
		int result = obj + 100;  //원래 obj는 클래스라 숫자 100과의 연산은 불가능. 하지만 obj가 내부 값을 가져와서 100+100이라는 연산이 됨
		System.out.println("result : " + result);
		
		
		//포장 객체 비교
		// 일정 범위 안의 값은 전제 조건을 무너뜨림
		System.out.println();
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3==obj4));
		System.out.println("언박싱 후 ==결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
	
		// 범위 밖의 비교
		System.out.println();
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("==결과 : " + (obj5==obj6));
		System.out.println("언박싱 후 ==결과 : " + (obj5.intValue() == obj6.intValue()));
		System.out.println("equals() 결과 : " + obj5.equals(obj6));
		
		//Integer를 비교할땐 String 처럼 equals를 사용하면 됨
		
	}

}
