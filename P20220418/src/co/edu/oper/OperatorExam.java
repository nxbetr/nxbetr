package co.edu.oper;

public class OperatorExam {

	public static void main(String[] args) {
		
		// +, -, *, /, %
		//   / -> 몫만 가져옴
		//   % -> 몫을 제외한 나머지
		// 10000초 -> 10000/(60*60) => 시간
        //        -> 10000/60 => 분
		//        -> 10000%60 => 초
		int hour = 10000/(60*60);  // 만초를 시간으로 변환
		int min = 10000/60;       // 만초를 분으로 변환 
		int sec = 10000%60;      // 남는 초 계산
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		//증감연산자
		int i = 0;
		int j = 1;
		i = i + 1;
		//대입 연산자
		// i + = 2;
		//i = i-2  -> i -= 2;
		// -=, /=
		i += 1;
		//윗줄이랑 같은 뜻
		
        //증감 연산자
		// i = i+1;
		// i = i + j++;
		
		i = i + j++; //-> 2
		// 뒤에 ++가 있으면 계산식이 끝난 후 +1 해줌
		i = i + ++j; // -> 3
		// 1+(1+1) 식이 됨 
		++i;
		
		//i = 0;
		i++;
		System.out.println(i);  // 1
		++i;
		System.out.println(i);  // 2
		
		System.out.println(++i); // 3
		System.out.println(i++); // 구문을 실행 후 i를 더함 3
		System.out.println(i); // 4
		
	}

}
