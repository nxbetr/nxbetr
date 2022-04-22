package co.edu.ass;

public class A {
	
	
	//default
	// 같은 패키지 내에 있는 클래스에서만 호출 가능
	int a;

	// public
	// 모든 패키지 및 클래스에서 호출 가능
	public int b;

	// protected
	// 같은 패키지 내에 있는 클래스 및 자식 클래스에서 호출 가능
	protected int c;

	// private
	//속해 있는 클래스에서만 사용 가능
	private int d;
}
