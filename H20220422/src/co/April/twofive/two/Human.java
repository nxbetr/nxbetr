package co.April.twofive.two;

public class Human {
	// 필드, 이름 키 몸무게

	String name;
	int height;
	int weight;

	//생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	//메소드
	 public void getInformation() {
		 System.out.printf("이름 :" + name, "키 :"+ height,"몸무게 :"+ weight);
	 }
	
	
}
