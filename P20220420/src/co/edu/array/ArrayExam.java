package co.edu.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {

		// 배열 -> 같은 데이터 타입을 연속된 공간에 저장
		int[] ary = new int[5]; // int타입(정수) 배열, 다섯개의 데이터 저장 공간을 만듦.

		// 데이터 넣는 법 1.
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;

		// 데이터 넣는 법 2.
		int[] ary1 = { 1, 2, 3, 4, 5 };

		// 배열을 만들고 Scanner를 통해 데이터를 넣는 법
		Scanner sc = new Scanner(System.in);
		int[] ary2 = new int[5];
		for (int i = 0; i < ary2.length; i++) { System.out.println("데이터를 입력하세요"); 
		 ary[0] = sc.nextInt(); 
		 ary[1] = sc.nextInt(); 
		 // 위 두줄이 밑 한줄이랑 같음 
		 // 각 배열 첫번째~다섯번째 데이터를 넣는 구문 
		 ary2[i] = sc.nextInt(); 
		 // 각 배열의 데이터 출력
		 System.out.println(ary2[i]); }
		
		for(int i=0; i<ary2.length; i++) {
			System.out.println("점수를 입력하세요");
			ary2[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<ary2.length; i++) {
			sum += ary2[i]; // sum = sum + ary[i]
		}
		System.out.println("총점 : " + sum );
		System.out.println("평균 : "+(double)(sum/ary2.length));
		
		// 1부터 100까지 합을 구하는 방법
		int[] ary3 = new int[100];
		for(int i=0; i<ary3.length; i++) {
			// 변수 i를 사용해 데이터를 저장하는 법
			ary3[i] = i+1;
		}
	
		sum = 0; //위에서 sum에 데이터가 들어가 있어서 0으로 초기화 해줌
		for(int i=0; i<ary3.length; i++) {
			//sum에 배열 0~99번째까지의 데이터를 누적
			sum += ary3[i]; 
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 0; i < ary3.length; i++) {
			// 100번째 배열 자리에 1~99를 더한 값을 저장
			if( i ==99 ) {
				ary3[i] = sum;
				break;
			}
			sum += ary3[i];
			
		}
		System.out.println(ary3[99]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
