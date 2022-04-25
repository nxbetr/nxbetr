package co.April.twotwo;

import java.util.Scanner;

public class Main extends Student {

public static void main(String[] args) {

System.out.println("===========================================================");
System.out.println("1.학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
System.out.println("===========================================================");
System.out.println("선택>");
Scanner sc = new Scanner(System.in);
int info = sc.nextInt();
int i = 0;


// System.out.println("학생 수:" + studentNo);

switch (info) {
case 1:

System.out.println("학생 수>");
sc.nextLine();
int No = (int) Integer.parseInt(sc.nextLine());
Student[] std = new Student[No];

System.out.println("===========================================================");
System.out.println("1.학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
System.out.println("===========================================================");
sc.nextLine();

case 2:

// System.out.println("학번 :" + studentNo+" " + "이름 :" + studentName+" " + "국어 :"
// + kor+" " + "수학 :" + math+" " + "영어 :" + eng);
sc.nextLine();
System.out.println("학번>");
int studentNo = (int) Integer.parseInt(sc.nextLine());


System.out.println("이름>");
String studentName = sc.nextLine();

System.out.println("국어>");
int kor = (int) Integer.parseInt(sc.nextLine());

System.out.println("수학>");
int math = (int) Integer.parseInt(sc.nextLine());

System.out.println("영어>");
int eng = (int) Integer.parseInt(sc.nextLine());




System.out.println("===========================================================");
System.out.println("1.학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
System.out.println("===========================================================");
System.out.println("선택>");

case 3:
	sc.nextLine();
	System.out.println("학번>");
	int studentNo = (int) Integer.parseInt(sc.nextLine());


	System.out.println("이름>");
	String studentName = sc.nextLine();

	System.out.println("국어>");
	int kor = (int) Integer.parseInt(sc.nextLine());

	System.out.println("수학>");
	int math = (int) Integer.parseInt(sc.nextLine());

	System.out.println("영어>");
	int eng = (int) Integer.parseInt(sc.nextLine());

}
}
}