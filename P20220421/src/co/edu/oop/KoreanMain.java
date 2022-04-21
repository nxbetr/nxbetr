package co.edu.oop;

public class KoreanMain {

	public static void main(String[] args) {
		
		//각 객체의 주소 번지
		Korean k1 = new Korean("박자바", "012312-3424");
		Korean k2 = new Korean("김자바","1234-34352");
		
		k1.getInfo();
		k2.getInfo();
		
		System.out.println();
		System.out.println();
		
		Korean k3 = new Korean("미국", "이자바", "43543-676776"); //대한민국으로 지정해뒀지만 미국으로 바꿔 쓸 수 있음
		k3.getInfo();
		
		
		}
	

}
