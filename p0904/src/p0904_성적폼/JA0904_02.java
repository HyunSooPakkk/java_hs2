package p0904_성적폼;

import java.util.Scanner;

public class JA0904_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두 수를 입력받아 두 수의 곱을 맞추는 프로그램을 구현하시오.
		// 두 수를 입력받아 출력한 다음
		// 두 수의 곱의 정답을 입력해서 맞으면 정답, 틀리면 오답이라고 출력하시오.
		
		
//		System.out.println("첫 번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("두 번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//		int result = num1*num2;
//		
//		System.out.printf("%d*%d는 얼마일까요? \n",num1,num2); // 숫자 두 개의 곱을 구하는 PrintF
//		
//		if(result==(num1*num2)) {
//			System.out.println("정답입니다.");
//			
//		} else {
//			System.out.println("오답입니다.");
//		}
		
		
		
		
		
		
//		System.out.println("5*4는 얼마일까요?");
//		int2 score = scan.nextInt();
//		if(score==20) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.println("오답입니다.");
//		}
		
		
		
		System.out.println("사랑을 영어로 입력하세요.");
		String result2 = scan.next();
		if(result2.equalsIgnoreCase("love")) { // 8가지 기본타입이 아닌 경우(String), equals 명령어를 사용한다.
			//equalsIgnoreCase는 대소문자 구분 안 하고싶을 때 사용.
			System.out.println("정답입니다.");
			
		} else {
			System.out.println("오답입니다.");
		
		}
		
		
		
		

	}//main

}//class
