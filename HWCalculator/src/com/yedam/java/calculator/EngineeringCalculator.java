package com.yedam.java.calculator;

public class EngineeringCalculator extends Calculator {

	private String[] operatorList; // 입력받은 연산자 저장하는 배열
	private int operatorCount; // 입력받은 연산자 갯수

	@Override
	public void init() {    // 연산자는 숫자보다 무조건 -1
		numList = new double[5]; 
		numCount = -1;
		operatorList = new String[numList.length - 1];
		operatorCount = -1;
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[++numCount] = num;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자는 최대 5개까지 입력가능합니다.");
			numCount--;
		}
	}

	@Override
	public void print() {
		if(check()) {  
			System.out.println("계산결과 : " + getCalResult());
		}
	}
	
	private boolean check() {   //연산자보다 숫자가 최소한 하나는 더 많아야 함.
		boolean result = false;
		if((operatorCount + 1) == numCount) {
			result = true;
		}else {
			System.out.println("현재까지 입력된 연산식을 확인해주세요.");
		}
		return result;
	}
	
	private double getCalResult() {   //숫자가 가진 0번째 인덱스 값은 따로 처리
		double result = numList[0];  //숫자가 가진 두번째 값과 첫번째 연산자의 관계를 확인, 첫번째 값은 result가 가짐
		for(int i=0; i<=operatorCount; i++) {
			switch(operatorList[i]) {
			case "+":
				result += numList[i+1];
				break;
			case "-":
				result -= numList[i+1];
				break;
			case "*":
				result *= numList[i+1];
				break;
			case "/":
				result /= numList[i+1];
				break;
			case "%":
				result %= numList[i+1];
				break;
			}
		}
		return result;
	}

	@Override
	public void plus() {
		try {
			operatorList[++operatorCount] = "+";   //배열에 해당되는 연산자 +를 넣어줌
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void subtract() {
		try {
			operatorList[++operatorCount] = "-";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void multiply() {
		try {
			operatorList[++operatorCount] = "*";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void division() {
		try {
			operatorList[++operatorCount] = "/";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void remain() {
		try {
			operatorList[++operatorCount] = "%";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("연산자는 최대 4개까지 입력가능합니다.");
			operatorCount--;
		}
	}

	@Override
	public void delete() {
		try {
			if (numCount > operatorCount) {  //입력받은 숫자의 갯수가 연산자의 갯수보다 많은면 숫자 먼저 삭제. 연산자가 더 많거나 둘이 같으면 연산자 먼저 삭제
				numList[numCount--] = 0;
			} else {
				operatorList[operatorCount--] = null;
			}
		} catch (ArrayIndexOutOfBoundsException e) {    //숫자가 -가 나오면 이게 나옴
			System.out.println("더이상 삭제할 값이 없습니다.");
			init();   //두 배열 다 초기화를 시켜야 해서 각각 명령어 처리보단 init 메소드를 통해 처리하는게 편함
		}

	}
	
	@Override
	public void printMenu() {  //공학계산기는 메뉴 출력 후 현재까지 연산식 출력도 있음
		super.printMenu();
		getExpression();  //공학용 계산기만 가진 기능을 추가 
	}
	
	private void getExpression() {
		String result = "";
		for(int i=0; i < numList.length; i++) {
			if(i<=numCount) {
				result += String.valueOf(numList[i]);
			}
			
			if(i<=operatorCount) {
				result += operatorList[i];
			}
		}
		
		System.out.println("현재 연산식 : " + result);
	}
}
