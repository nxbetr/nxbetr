package co.edu.oop;

public class Korean {

	// 필드
	String nation = "대한민국";
	String name;
	String ssn;

	
	
	// 생성자
	//생성자의 오버로딩
	public Korean(String n, String s) {
		// this는 클래스 내에 선언한 변수를 찝어 말할 때 사용
		this.name = n;
		this.ssn = s;
	}

	public Korean(String n, String s, String p) {
		this.nation = n;
		this.name = s;
		this.ssn = p;
	}

	
	
	// 메소드의 오버로딩
	void getInfo() {   // return이 필요없는건 void로 작성
		System.out.println("국적 :" + nation); // ("국적 :" + this.nation); 해도 됨
		System.out.println("이름 :" + name);
		System.out.println("주민번호 :" + ssn);
	}

	
//       void가 return을 만나면
	/*
	 * void getInfo() { 
	 * System.out.println("국적 :" + nation);
	 * System.out.println("이름 :" + name); 
	 * return; // void 타입이 return을 만나면 위 두문장만
	 * 실행되고 종료 됨 System.out.println("주민번호 :" + ssn); // 실행되지 않음
	 */	
	
	
	
}
