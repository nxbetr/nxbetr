package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {
		int sum = 0; // 변수 초기화

//		sum += 1;
//		sum += 2;
//		sum += 4; 
//		sum += 5;
//		System.out.println("1~5의 합" + sum);
//		

		// 1~5까지의 합을 만들어보는 프로그램, 위랑 같음
		// for (int i = 1; i <= 5; i++) {
		// sum = 0
		// 1. i=1, 0 = 0 + 1; -> sum 1;
		// 2. i=2, 1 = 1 + 2; -> sum 3;
		// 3. i=3, 3 = 3 + 3; -> sum = 6;
		// 4. i=4, 6 = 6+ 4; -> sum = 10;
		// 5. i=5 10 = 10 + 5; -> sum 15
		// sum = sum + i;

		// 구구단 2단 만들기
		// 2*1 2*2 ... 22*9

		for (int i = 1; i <= 9; i++) {
			System.out.println("2단 : 2 * " + i + " = " + (2 * i));
		}
		System.out.println("end");

		// 1~100 중의 3의 배수 구하기
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // 3의 배수를 구하는 조건
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println("홀수 :" + i);
			} else if (i % 2 == 0) {
				System.out.println("짝수 :" + i);
			}
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println("구구단 3X" + i + " = " + (3 * i));
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println("4단 4X" + i + " = " + (4 * i));
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

		// 별찍기
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {  //
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("end");
		
		
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
				System.out.println();
			}
		
		for(int i =0; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
	/*	for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();*/
		}

	}


