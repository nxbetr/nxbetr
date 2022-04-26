package co.April.twofive.two;

public class ObesityInfo extends StandardWeightInfo {

	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	
	public void getInformation() {
		System.out.println("이름 :" + name + "키 :" + height + "몸무게 :" + weight );
			
		}
	
	public double getObesity = (double)((weight - getStandardWeight)/getStandardWeight);{
	System.out.println("비만도 : "+ (double) getStandardWeight);
	
	
	if(weight == getStandardWeight) {
		System.out.println("표준 체중 :"+weight);
	}else  {
		System.out.println("비만입니다");
		
	}

	}
}
