package com.yedam.java.calculator;

public class GeneralCalculator extends Calculator {

	@Override
	public void init() {     //Cal은 별도의 생성자가 필요없고 init만 초기화 해주면 됨.
		numList = new double[2];   //일반계산기에서는 두자리 숫자만 받는다는 뜻
		numCount = -1;   //numCount를 통해 인덱스 역할도 하기 위해 -1이라 함. 
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[++numCount] = num;   //초기값이 -1이라 ++를 앞으로 보낸다. 그래야 0으로 시작해서. 넘카운트가 0이였다면 ++가 뒤로 감
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자는 최대 2개까지 입력가능합니다.");
			numCount--;  //원상복귀 시키는 것. 넘카운트가 2가 되어버리면 오류
		}
	}

	@Override
	public void print() {
		System.out.print("현재까지 입력된 숫자 : ");  
		for(int i=0; i <= numCount; i++) {   //최대값은 넘카운트를 사용. 사용자가 입력한 값만 출력하기 위해
			System.out.print(numList[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void plus() {
		if(check()) {   //입력된 숫자가 두개가 맞는지 조건에 넣어야함 
			System.out.printf("+ : %.1f\n", numList[0] + numList[1]);
		}
	}

	@Override
	public void subtract() {
		if(check()) {   
			System.out.printf("- : %.1f\n", numList[0] - numList[1]);
		}
	}

	@Override
	public void multiply() {
		if(check()) {
			System.out.printf("* : %.1f\n", numList[0] * numList[1]);
		}
	}

	@Override
	public void division() {
		if(check()) {
			System.out.printf("/ : %.1f\n", numList[0] / numList[1]);
		}
	}

	@Override
	public void remain() {
		if(check()) {
			System.out.printf("%% : %.1f\n", numList[0] % numList[1]);
		}
	}

	@Override
	public void delete() {
		try {  //if문 사용해도 됨
			numList[numCount--] = 0;    // -가 앞으로 가면 넘카운트가 주는 값은 0. 우리는 1부터 0으로 초기화 하는 것이기 때문에 넘카운트가 가진 1의 값을 먼저 넘리스트에게 줌.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("더이상 삭제할 숫자가 없습니다.");
			init();  //처음 상태로 돌리기위해 init을 사용. 원상복귀를 위해 넘카운트++를 해도 됨
		}
	}
	
	private boolean check() {
		boolean result = false;
		if((numCount+1) == numList.length) {  //넘카운트를 어떻게 설정하냐에 따라 +1의 값이 달라진다
			result = true;
		}else {
			System.out.println("숫자를 더 입력해주세요.");
		}
		return result;
	}

}
