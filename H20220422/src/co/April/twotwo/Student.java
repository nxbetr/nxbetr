package co.April.twotwo;

public class Student {

public static void main(String[] args) {

}
int studentNo;
String studentName;
int kor;
int eng;
int math;



//클래스명[] 객체명 = new 클래스명[배열의 크기];
Student[] std = new Student[0];




//method

void stuinfo() {
System.out.println("학번 :" + studentNo+" " + "이름 :" + studentName+" " + "국어 :" + kor+" " + "수학 :" + math+" " + "영어 :" + eng);

}

void avg() {

double avg = (double) (kor + math + eng) / 3;

System.out.println(studentName + "평균 점수: " + avg + "점");
}

public int getStudentNo() {
return studentNo;
}

public void setStudentNo(int studentNo) {
this.studentNo = studentNo;
}

public String getStudentName() {
return studentName;
}

public void setStudentName(String studentName) {
this.studentName = studentName;
}

public int getKor() {
return kor;
}

public void setKor(int kor) {
this.kor = kor;
}

public int getEng() {
return eng;
}

public void setEng(int eng) {
this.eng = eng;
}

public int getMath() {
return math;
}

public void setMath(int math) {
this.math = math;
}

public Student[] getStd() {
return std;
}

public void setStd(Student[] std) {
this.std = std;
}


}