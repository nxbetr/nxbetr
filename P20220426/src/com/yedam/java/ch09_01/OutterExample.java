package com.yedam.java.ch09_01;

public class OutterExample {
	
	public static void main(String[] args) {
		
		//Nested는 Outter안에 있어서 Outter를 통해 만들어줌
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
		
	}
}
