package co.edu.condition;

public class Grade {

	public static void main(String[] args) {

		boolean run = true; // 숫자 6이 나왔을때 멈추기 위해 넣음
		while (run) {
			int num = (int) (Math.random() * 6) + 1; // 1부터 6까지의 데이터를 랜덤추출 1 ~ <7
			// Math.random()은 0<= x <1 double 타입
			// (Math.random() * 10) + 1;은 1 <= x < 11 , (int)로 강제 변환
			System.out.println("주사위의 수는 : " + num);

			switch (num) {
			case 1: // case 문 뒤에는 break를 안걸어주면 계속 반복 됨
				System.out.println("주사위는 1");
				break;
			case 2:
				System.out.println("주사위는 2");
				break;
			case 3:
				System.out.println("주사위는 3");
				break;
			case 4:
				System.out.println("주사위는 4");
				break;
			case 5:
				System.out.println("주사위는 5");
				break;
			default:
				System.out.println("주사위는 6");
				run = false;
				break;

			}
		}
	}

}
