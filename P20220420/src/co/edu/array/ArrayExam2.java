package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[] ary1 = { 5, 10, 4, 7, 8 };
		int max = 0;
		int min = ary1[0]; // 넣은 데이터 값 중 첫번째 칸으로 설정 (0을 넣어도 0보다 작은 숫자가 없어서 0번째 칸을 넣음)
		for (int i = 0; i < ary1.length; i++) {
			// 최대값
			if (max < ary1[i]) {
				max = ary1[i];
			}
			// 최소값
			if (min > ary1[i]) {
				min = ary1[i];
			}
		}
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);

		Scanner sc = new Scanner(System.in);
		int[] ary2 = null; // 배열을 만들되 크기를 아직 미정, Scanner로 데이터를 받음
		System.out.println("배열의 사이즈를 입력하세요");
		// 배열 사이즈 입력
		int num = sc.nextInt();
		// 입력 한 값으로 배열 크기 설정
		ary2 = new int[num];

		for (int i = 0; i < ary2.length; i++) {
			ary2[i] = i + 1; // 1부터 배열의 크기만큼 데이터 입력
		}

//		for(int i=0; i<ary2.length; i++) {
//			if(ary2[i] % 2 == 0) {  // 2의 배수 구하기
//				System.out.println(ary2[i]);
//			}
//			
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 1) { // 홀수 구하기
				System.out.println(ary2[i]);
			}
		}
		int[] ary3 = new int[num]; // 공간은 만들고 데이터를 넣지않음

		// ary2 ary3 배열을 총 두개 만듦.
		for (int i = 0; i < ary3.length; i++) { // length 대신 num 넣어도 됨
			ary3[i] = i;
		}

		// 중첩 반복문, 조건문을 이용한 데이터 출력
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2.length; j++) {
				// 조건 : ary2데이터 + ary3의 데이터 < 10이 나오는 경우
				if (ary2[i] + ary3[j] < 10) {
					System.out.println("1." + ary2[i] + " / " + "2." + ary3[j]);
				}
			}
		}
	}

}
