package com.yedam.java.ch11_02;

public class StringBuilderExample {
 
	public static void main(String[] args) {
		//성능상 여러번 수정을 한다면 StringBuilder를 사용
		
		StringBuffer sb = new StringBuffer();
		
		//문자열을 끝에 추가
		sb.append("JAVA ");  // append -> 뒤에 붙인다는 의미
		sb.append("Program Study");
		System.out.println(sb.toString()); // 내부의 것을 결합해서 최종적으로 보냄
		
		
		//해당 인덱스 위치 앞에 값을 삽입
		sb.insert(4, "2");    // 01234 중 4의 자리는 공백이라 공백앞에 2가 들어감
		System.out.println(sb.toString());
		
		//해당 인덱스 위치의 값을 변경
		sb.setCharAt(4, '6');  
		System.out.println(sb.toString());
		
		//시작 인덱스 부터 지정한 인덱스 전까지 지정해서 대체
		sb.replace(6, 13, "Book"); // 6부터 13전까지를 Book으로 변경
		System.out.println(sb.toString());
		
		//시작 인덱스부터 지정한 인덱스 전까지 삭제
		sb.delete(4, 5); // 4부터 5전까지 즉 인덱스 네번째에 있는 값만 수정
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		
		//최종적으로 연산이 끝났다면 변수에 저장해줘야 함. 그러지 않으면 계속해서 연산이 일어남
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());
		
	}
}
