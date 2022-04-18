package co.yedam.var;

public class VariableExample {

	public static void main(String[] args) {
		int var1 = 0b1011;  // 2진수 
		int var2 = 0206;   // 8진수
		int var3 = 365;    // 10진수
		int var4 = 0xB3;  // 16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		long longVar1 = 10;
		long longVar2 = 20L;
	//	long longVar3 = 1000000000000000;  //int 넘어가면 L 붙여야 함
		long longVar4 = 10000000000L;
		
	//	System.out.println(longVar3);
		System.out.println(longVar4);
		
		
		char c1 = 'A';   // 단일 문자는 문자라 부르고 '' 를 사용
		char c2 = 65;
		char c3 = 44032;
		char c4 = 33;
		
		System.out.println(c1);  // A
		System.out.println(c2);  // A
		System.out.println(c3);  // 가
		System.out.println(c4);  // !
		
		
		String str = "AB";  // 여러 문자는 문자열이라 부르고 ""를 사용
		// string 은 기본타입이 아닌 참조타입이다
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		
		System.out.println("번호\t이름\t직엄");
		// \t -> tab키
		System.out.println("행 단위 출력\n");
		// \n -> Enter 키
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("문자열 String");
		
		//실수 타입 : float, double
		
	//	float floatVar1 = 3.14;  
		// f가 없으면 기본적으로 double 로 인식한다
		// float 실수타입 데이터는 뒤에 f를 쓴다. 
		float floatVar2 = 3.14f;
		
		double doubleVar1 = 0.321;
		// double 타입은 f 없이 사용한다
		
		float floatVar3 = 0.1234567890123456789f;
		double doubleVar2 = 0.123456789012346789;
		// 같은 길이의 숫자를 출력 시 float은 7자리 double은 15자리까지 인식한다
		
		System.out.println(floatVar3);
		System.out.println(doubleVar2);

		boolean stop = true;
		boolean state = false;
		
		if(state) {  
			// stop을 넣으면 true 라서 중지합니다 출력
			// state를 넣으면 false 라서 시작합니다 출력
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}

}
