package co.edu.getset;

public class Car {

// field
	public String company;
	public String model;
	public String color;
	public int speed;

	// 생성자

	// 메소드

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
		//속도 mile -> km로 변환하려면
		//return speed; 대신 return speed*2; 라고 쓴다
	}

	public void setSpeed(int speed) {
		//속도에 마이너스는 없으니 마이너스가 입력될 경우 0으로 표시하게 하는 설정
		if (speed < 0) {
			speed = 0;
		
		}
		this.speed = speed;
	}

}
