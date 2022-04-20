package co.edu.array;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 1~100 데이터를 넣은 배열에서 3의 배수만 출력
		int[] ary = new int[100];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1;
			if (ary[i] % 3 == 0) {
				System.out.println("3의 배수 " + ary[i]);

			}
		}

		// 1~100 데이터의 배열에서 짝수만 출력
		int[] ary1 = new int[100];
		for (int i = 0; i < ary.length; i++) {
			if (ary1[i] % 2 == 0) {
				System.out.println("짝수 " + ary[i]);
			}

		}
	}
}
