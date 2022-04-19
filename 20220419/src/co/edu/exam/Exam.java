package co.edu.exam;

import java.util.Scanner;

public class Exam {

	// 1. 화씨를 섭씨로
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("화씨를 입력하세요");
		int c_temp = sc.nextInt();
		double f_temp = 5 / 9.0 * (c_temp - 32);
		System.out.printf("%.2f\n", 5 / 9.0 * (c_temp - 32));

		// 내가한거
		sc = new Scanner(System.in);
		System.out.print("화씨를 입력하세요 :");
		int F = sc.nextInt();
		double C = (double) 5 / 9 * (F - 32);
		System.out.println("섭씨 " + C + "입니다.");

		// 2. 가위(0) 바위(1) 보(2)
		// 0,0 | 0,1 | 0,2
		// 1,0 | 1,1 | 1,2
		// 2,0 | 2,1 | 2,2
		System.out.println("가위(0),바위(1),보(2)");
		//Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int random = (int)(Math.random() * 3);


		switch (user) {
		case 0:
			if(random == 1) {
				System.out.println("졌습니다.");
			}else if (random == 2) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;

		case 1:
			if(random == 1) {
				System.out.println("졌습니다.");
			}else if (random == 2) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
			
		case 2:
			if(random == 1) {
				System.out.println("졌습니다.");
			}else if (random == 2) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;


		// 학점
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		switch (point / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		}

	}

}
}
