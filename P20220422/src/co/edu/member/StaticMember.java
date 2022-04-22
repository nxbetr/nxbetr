package co.edu.member;

public class StaticMember {
	int a;
	static double PI = 3.14159; 
	
	static int plus(int x, int y) {
		//StaticMember sm = new StaticMember();// 인스턴스화 안하면 a는 오류가 남
		return x+y;
		//return x+y+sm.a; // 인스턴스화 후에 a까지 포함해서 계산 할 수 있음
	}
	
	static int minus(int x, int y) {
		return x-y;
	
	}
}
	
		




	
