package co.edu.array;

import java.util.Scanner;

public class ArrayExam6 {

	public static void main(String[] args) {
		
		// 책 201p
		boolean run = true;
		int studentNum = 0; // 배열크기
		int[] scores = null; // 배열 데이터
		Scanner sc = new Scanner(System.in); // 데이터 입력

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력| 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = sc.nextInt(); 
				//숫자 대신 문자열을 받을땐 studentNum = Integer.parseInt(sc.nextLine());로 씀
				scores = new int[studentNum];
				sc.nextLine();

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = sc.nextInt();
				}
				sc.nextLine();
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					max = max < scores[i] ? scores[i] : max;
					sum += scores[i];
				}
				System.out.println("최고 점수 :" + max);
				System.out.printf("평균 점수 : %.2f\n", (double) sum / scores.length);
				
//				if(max <scores[i]) {   윗줄평균 구하기랑 같음
//					max =scores[i];
//				}
//				sum+= scores[i];
//				}
			} else if (selectNo == 5) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");
	}

}
