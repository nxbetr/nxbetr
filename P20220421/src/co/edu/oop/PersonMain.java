package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {
		
		
		Person per = new Person();
		
		per.num = "9393-3383";
		per.name = "John";
		per.add = "daegu";
		per.age = 20;
		per.introduce();
		
		Person per1 = new Person ("213213-12313", "Kim", "seoul",40);
		per1.introduce();
		
		Person per2 = new Person("12312-213","김자바","대구",20);
		per2.introduce();
	}
}
