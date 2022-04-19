package co.edu.condition;

import java.util.Scanner;

public class Quizzzz {

	public static void main(String[] args) {
		/*
		 * //화씨를 섭씨로 Scanner sc = new Scanner(System.in);
		 * System.out.print("화씨를 입력하세요 :"); int F = sc.nextInt(); double C = (double) 5
		 * /9 * ( F - 32); System.out.println("섭씨 " + C + "입니다.");
		 * 
		 * }
		 */

		// 가위바위보
		Scanner sc = new Scanner(System.in);
		System.out.println("가위[0], 바위[1], 보[2] 선택하세요");
		int com = (int) (Math.random() * 3);
		if (com == 0) {
			System.out.println("가위");
		} else if (com == 1) {
			System.out.println("바위");
		} else if (com == 2) {
			System.out.println("보");

			/*
			 * //학점 Scanner sc2 = new Scanner(System.in); System.out.println("점수를 입력하세요");
			 * 
			 * int score = (int)(Math.random()*101); switch (90 <= 100) { case 1: case 2:
			 * System.out.println("A"); break; case 89: System.out.println("B"); break; case
			 * 3: System.out.println("C"); break;
			 * 
			 * 
			 * }
			 */
		}

	}

}
