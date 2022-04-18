package co.yedam.var;

public class VariableExample2 {

	public static void main(String[] args) {
		
//		byte a = 10;
//		int b = a;
//		long c = b; // 큰 쪽은 작은 쪽을 자동 타입 변환 할 수 있다
//		
//		byte d = 10;
//		char f = d; // byte 보다 char가 크지만 음수를 포함하지 않아 byte를 못 넣는다
	
		
		int intValue = 44032;
		char charValue = (char)intValue;
		//
		
		int intValue1 = 10;  // 1byte 127까지 표현 가능 
		//byte byteValue = int //int가 더 커서 byte에 안들어감
		byte byteValue = (byte)intValue1; //(byte)로 강제로 넣음
		
		System.out.println(byteValue);
		
		
		
		
		
      
	}

}
