package co.edu.ass;

public class B {

	public static void main(String[] args) {

		A a = new A();
		int temp;
		// 1. default
		temp = a.a;
		
		// 2. public
		temp = a.b;
		
		// 3. protected
		temp = a.c;
		
		// 4. private
		// d를 A 클래스에 만들어둬서 A 클래스에서만 사용 가능
		//temp = a.d;
		
		
	}

}
