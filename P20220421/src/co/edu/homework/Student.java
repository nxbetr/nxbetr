package co.edu.homework;

public class Student {
//필드

	// field
	// 학생정보, 학번 이름 국어 수학 영어

	int stuNum;
	String name;
	int kor;
	int math;
	int eng;
	double avg;

	// 생성자
	// 기본 생성자를 만든 후 인스턴스에 데이터 입력

	public Student() {

	}
	
	

	// 메소드
	// 학생 기본 정보 출력, 학번 이름 국어 수학 영어
	// 평균 점수 출력

	void info() {

		System.out.println("학번:" + stuNum + " " + "이름:" + name + " " + "국어:" + kor + "점 " + "수학:" + math + "점 " + "영어:"
				+ eng + "점");
		double avg = (double) (kor + math + eng) / 3;
		
		System.out.println(name + "평균 점수: " + avg + "점");
	}
}
