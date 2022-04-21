package co.edu.oop;

import java.util.Scanner;

public class ShoppingMallMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 번호 입력 > ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("주문자 아이디 입력 > ");
		String id = sc.nextLine();
		System.out.println("주문자 이름 입력 > ");
		String name = sc.nextLine();
		System.out.println("상품 번호 입력 > ");
		int productNum = Integer.parseInt(sc.nextLine());
		System.out.println("주소 입력 > ");
		String add = sc.nextLine();

		ShoppingMall shp = new ShoppingMall(num, id, name, productNum, add);
		shp.getInfo();
	}
   
}
