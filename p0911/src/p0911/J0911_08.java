package p0911;

import java.util.Scanner;

public class J0911_08 {
	
	//int result; 자동으로 0을 넣어줌. 인스턴스변수, 클래스변수는 가능.
	
	public static void main(String[] args) {
		//입력받고
		//계산하고
		//출력도 했는데
		int result = 0;
		//클래스 참조변수 = new 클래스명
		J0911_08 j = new J0911_08();
		result = j.addInput();
		System.out.println("결과값: "+result);

	}//main

	//계산부분 여기로 빼봄 ▼
	//인스턴스 메소드 -> 객체선언 참조변수명.변수명
	int addInput() {
		int result = 0;
		//입력받고 계산하기
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자: ");
		int a = scan.nextInt();
		System.out.println("2번째 숫자: ");
		int b = scan.nextInt();
		result = a+b;
		
		return result;
	}

}//class
