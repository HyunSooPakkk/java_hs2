package p0901;

import java.util.Scanner;

public class JA0901_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// if~else if~else문 사용
		System.out.println("점수를 입력하세요.");
		int number = scan.nextInt();
		if(number>=90) {
			System.out.println("A학점입니다.");
		} else if(number<=89&&number>=80) {    // &&까지 생략 가능 } else if(number>=80) {
			System.out.println("B학점입니다.");
		} else if(number<=79&&number>=70) {
			System.out.println("C학점입니다.");
		} else if(number<=69&&number>=60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		
		
		
		
		// if~else 사용
//		System.out.println("점수를 입력하세요.");
//		int number = scan.nextInt();
//		
//		if(number>=60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//			
//			if(number>=60) {  //2줄 이상이면 중괄호 생략 불가
//				System.out.println("합격입니다.");
//				System.out.println("교무부");
//			} else          //1줄일 때 중괄호 생략 가능
//				System.out.println("불합격입니다.");
		
		
		// if문만 사용
//		System.out.println("사원번호를 입력하세요.");
//		int number = scan.nextInt();
//		//사원번호 1001: CEO. CEO는 회사 매출액 보기 메뉴를 볼 수 있음.
//		System.out.println("[네비게이션 메뉴]");
//		System.out.println("1. 회원정보 보기");
//		System.out.println("2. 상품정보 보기");
//		System.out.println("3. 회사소개 보기");
//		if(number == 1001) {
//			System.out.println("4. 회사 매출액 보기");
		}
		

	}

}
