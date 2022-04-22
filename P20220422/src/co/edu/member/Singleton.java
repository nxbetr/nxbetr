package co.edu.member;

public class Singleton {
	
	//필드	
	//private은 싱글톤 객체를 만들어도 싱글톤 클래스 내부에서만 사용할 수 있게 해줌, 다른 클래스에선 X
	private static Singleton singleton = new Singleton();
		
	//생성자
	private Singleton() {
		
	}

	//정적 메소드
	static Singleton getInstace() { 
		if(singleton ==  null) {
			singleton = new Singleton();  
		}
		return singleton;
	}

}
