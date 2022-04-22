package co.edu.member;

//필드
public class Pizza {
	private String toppings;
	private int radius;
	private final double PI = 3.141592;
	static int count = 0;

	// 생성자

	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;

		// 메소드
	}
}
