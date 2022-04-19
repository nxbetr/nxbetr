package co.edu.IO;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		//데이터 입력을 받기 위해 scanner 선언
		Scanner sc = new Scanner(System.in);
		
		while(true) { //반복문 중괄호 실행 후 다시 올라가서 실행
			System.out.println("스캐너 값을 입력하세요.");
			String str = sc.nextLine();
			System.out.println("입력값 : " + str);
			if(str.equals("q")) {
				break; // q라는 데이터를 넣었을때 종료한다는 뜻
		}
		
		}
		/*System.out.println("스캐너 값을 입력하세요.");
		String str = sc.nextLine();
		//int value = sc.nextInt(); 
		System.out.println("입력값 :" + str);*/
		
        //괄호 안 내용 출력
		//System.out.print(false);
		//괄호 안 내용 출력 후 엔터
		//System.out.println();
		// 괄호 안 내용 커스텀 후 출력
		//System.out.printf(null,args);
		
		
		// printf 정수
		int value = 100;
		System.out.printf("%d\n", value);
		// %d 자리에 value(100)을 넣고 \n을 통해 다음 줄로 내려간다
		System.out.printf("%5d\n", value);
		// %5d 현재 정수가 세자리지만(value->100) 공백을 통해 다섯자리를 만들어줌
		System.out.printf("%-5d\n", value);
		// 반대로 -는 부족한 만큼 뒤에서 공백을 넣어서 5자리를 만들어줌
		System.out.printf("%05d\n", value);
		// 다섯자리를 만드는데 공백이 있을 시 0을 채워준다
		
		//printf 실수
		double value2 = 12.123;
		
		System.out.printf("%.2f\n", value2);
		//소숫점 아래 두자리만 표현
		System.out.printf("%9.4f\n", value2);
		//총 아홉자리를 출력, 대신 소숫점 네자리까지만 표현, 소숫점 공백에 0을 넣음,앞자리 공백채움 ->  12.1230 출력
		System.out.printf("%-9.0f\n", value2);
		//총 아홉자리를 출력, 소숫점 뒤에 아무것도 표시 안함, 남은 공간은 뒤에서 공백을 넣어줌
		
	/*	try { //?
			int keyCode = System.in.read();
			System.out.println("입력값 : " + keyCode);
			
		} catch (IOException e) {
			e.printStackTrace();*/
			
			
		}
		
	}

//}
