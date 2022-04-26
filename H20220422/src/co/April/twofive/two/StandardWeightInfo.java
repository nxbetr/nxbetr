package co.April.twofive.two;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	public void getInformation() {
		System.out.println("이름 :" + name + "키 :" + height + "몸무게 :" + weight );
			
		}
	
	public double getStandardWeight = (double)((height - 100) * 0.9);{
	System.out.println("표준 체중 : "+ (double) getStandardWeight);
	
	

	
	if(weight == getStandardWeight) {
		System.out.println("표준 체중 :"+weight);
	}else {
		System.out.println("비만입니다");
		
	}

	}
}
