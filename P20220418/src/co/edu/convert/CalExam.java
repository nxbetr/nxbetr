package co.edu.convert;

public class CalExam {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue; // double 타입으로 변환 됨
		// 정수+실수
		// System.out.println();  sysout + ctrl+space
		
		System.out.println(result);
		
		//자동타입변환 연산
		
		byte x = 10;
		byte y = 20;
		//byte result2 = x+y; ->안됨
		int result2 = x+y;
		System.out.println(result2);
		
		char c = 'A'; //65
		char d = 1;
		
		//char result3 = c+d; ->안됨
		int result3 = c+d;
		System.out.println(result3);
		System.out.println("유니코드 : " + result3); // 66출력
		System.out.println("출력문자 : " + (char)result3);  // B출력 
		
		
		//실수 타입 변환
		int i = 1; //정수타입
		double result4; //실수타입
		
		result4 = i/5; //정수 나누기는 소수점 없음 1/5 = 몫이 0 그래서 0출력
		System.out.println(result4);
		
		result4 = i/5.0; //정수가 실수타입으로 바뀜 1.0/5.0 = 0.2 출력
		System.out.println(result4);
		
		result4 =(double) i/5; //double 타입으로 변환시켜줘서 0.2 출력
		System.out.println(result4);
		
		// 문자열 + 연산		
		
		//숫자 + 숫자
		int value = 15;
		System.out.println(15+3);
		
		//문자열 + 숫자, 앞이 문자열이면 뒤도 문자열이 됨
		System.out.println("문자열+숫자 : " + value + 2);
		//-> ""가 붙어서 String이 되면 +는 덧셈이 아님, 문자열+숫자 : 152 출력
		System.out.println("문자열+숫자 : " + (value + 2));
		//-> ()로 묶어주면 ()부터 계산됨 , 문자열+숫자 : 17
		
		//숫자 + 문자열
		System.out.println(value+2 + "숫자+문자열");
		//->연산은 왼쪽부터 되기에 앞 정수 계산 후 String 타입으로 변환 됨, 17숫자+문자열 출력
		
		//문자열을 숫자로 타입 변환
		//(double), (int) = 숫자 연산에서만 사용
		String str = "1000";
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		String str1 = "0.3";
		double value2 = Double.parseDouble(str1);
		System.out.println(value2);
		
		/*
		 * String str3 = "가나다"; int value 3 = Integer.parseInt(str3);
		 * System.out.println(str3);
		 */
		
		String str4 = String.valueOf(value1); 
		//System.out.println(value1); ->1000이 출력
		//System.out.println(String.valueOf(value1).getClass().getSimpleName()); 
		//정수 타입을 구문을 통해 문자열로 바꿀 수 있음 , String이 출력 됨
		
		
	}

}
