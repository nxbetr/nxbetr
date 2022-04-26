package com.yedam.java.ch08_02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		
		//실제로 drive 뒤에 뭐가 들어가는지에 따라 drive 실행 결과가 달라짐
		driver.drive(new Bus());     //drive가 실행되는데 매개변수가 Bus로 들어옴, Bus의 run이 실행됨
		driver.drive(new Taxi());    //drive가 실행되는데 매개변수가 Bus로 들어옴, Taxi의 run이 실행됨
		
		
		 
	}

}
