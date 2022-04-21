package co.edu.homework;

public class Student {
//필드

	int num;
	String name;
	int kor;
	int math;
	int eng;
	double avg;

	// 생성자
	public Student() {
	}

	Student(int num, String name, int kor, int math, int eng) {

	}

	// 메소드 학번, 이름, 국어, 수학, 영어)
	void getInfo() {
		
		System.out.println("학번 :" + num+" " + "이름 :" + name+" " + "국어 :" + kor+" " + "수학 :" + math+" " + "영어 :" + eng);
		double avg = kor+eng+math;
		System.out.println("평균 점수 : " + avg/3);
		
		
	}

}
