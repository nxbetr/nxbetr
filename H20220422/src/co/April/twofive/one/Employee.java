package co.April.twofive.one;

public class Employee {
	//필드
		public String name;
		public int money;
		
		//생성자
		public Employee(String name, int money) {
			this.name = name; 
			this.money = money;
		}
		
		//메소드
		public void getInformation() {
			System.out.printf("이름 :"+name, "연봉 :" + money);
		
		}

			
		public void print()		{
			System.out.println("슈퍼클래스");
			}
	}


