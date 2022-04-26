package com.yedam.java.ch08_02;

public class Driver {            //매개변수가 실행되는 클래스
	
	
	//메소드
	public void drive(Vehicle vehicle) {        //Vehicle을 매개변수로 받음
		if(vehicle instanceof Bus) {   //강제 타입 변환을 하지않으면 실행창의 Taxi에서 오류가 남, Bus에서만 checkFare 기능을 실행하게 함
		Bus bus = (Bus) vehicle; //Vehicle은 Vehicle 기능만 사용할 수 있어서 Bus에만 있는 checkFare 기능 사용을 위해 Bus로 변환함
		bus.checkFare();
		}
		vehicle.run();   //vehicle이 위에서 Bus로 바꼈지만 vehicle은 vehicle대로 실행 됨
		
		//인스턴스는 동일하고 참조하는 변수가 bus냐 vehicle이냐의 차이 
		
	}
}
