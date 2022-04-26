package co.April.twofive.one;

public class EmpDept extends Employee {

	String empName;
	
	
	public EmpDept(String name,int money, String empName) {
		super(name, money);
	}
	
		
	@Override
	public void getInformation() {
		System.out.printf("이름 :"+name, "연봉 :" + money+ "부서 :"+empName);
		this.name = name;
		this.money = money;
		this.empName = empName;
	}
		
	public void print()		{
		System.out.println("슈퍼클래스 \n서브클래스");
		
        
		
		}

}
