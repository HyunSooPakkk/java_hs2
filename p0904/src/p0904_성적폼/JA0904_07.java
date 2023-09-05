package p0904_성적폼;

import java.util.Scanner;

public class JA0904_07 {

	public static void main(String[] args) {
		// 1-100까지 5개의 랜덤숫자를 생성해서 변수에 저장 후 출력하시오. 숫자 중복 가능.
//		int num = (int)(Math.random()*100)+3;
//		int num1 = (int)(Math.random()*46)+7;
//		int num2 = (int)(Math.random()*98)+5;
//		int num3 = (int)(Math.random()*100);
//		int num4 = (int)(Math.random()*27)+8;
//		
//		System.out.println(num);
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		
		// 1-10까지 5개의 랜덤숫자를 1개 생성해서 변수에 저장 후 출력하시오.
//				int num5 = (int)(Math.random()*10)+1;
//				System.out.println(num5);
				
       // 3개의 랜덤숫자를 입력받아 정답을 맞추는 프로그램을 구현하시오.
				// 1개 입력받아 맞는지 확인 후 정답/오답 출력.
				// 3개의 입력값을 출력. 입력번호: 1, 9, 7
				
		Scanner scan = new Scanner(System.in);
				
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				int random = (int)(Math.random()*10);
				
				System.out.println("첫 번째 숫자를 입력하세요.");
				num1 = scan.nextInt();
				if(num1==random) {
				System.out.println("정답입니다.");
				} else {
				System.out.println("오답입니다.");
				}
				
				System.out.println("두 번째 숫자를 입력하세요.");
				num2 = scan.nextInt();
				if(num2==random) {
				System.out.println("정답입니다.");
				} else {
				System.out.println("오답입니다.");
				}
				
				System.out.println("세 번째 숫자를 입력하세요.");
				num3 = scan.nextInt();
				if(num3==random) {
				System.out.println("정답입니다.");
				} else {
				System.out.println("오답입니다.");
				}
				
				//입력한 숫자 출력
				System.out.printf("입력번호: %d, %d, %d \n", num1, num2, num2);
				//정답번호: 5
				System.out.println("정답번호: "+random);
				
	
				
	
	}//main
	
	}//class
