package p0905;

import java.util.Scanner;

public class J0905_16_14copy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외워질때까지 0904_14 똑같이 쓰는 페이지
				// Question: 1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
				// H1. 변수, 클래스 선언 후 랜덤숫자 생성
				// H2. while 무한루프
				// H3. input 숫자입력받기
				// H4. if를 사용해서 랜덤숫자와 입력숫자가 맞는지 비교
				// H5. "입력한 숫자보다 큰 수/작은 수 입니다." notice
				// H6. 정답일 때 break; 사용
		
		Scanner scan = new Scanner(System.in);
		
		int random = 0;
		int count = 0; //카운트 변수: 숫자 갯수를 입력하는 메소드. i로 해도 됨
		int number = 0;
		int[] arrNum = new int[10]; 
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 컨닝: "+random);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number; //입력된 숫자를 배열에 저장
			
			if(random==number) { //숫자가 맞는지 비교
				System.out.println("정답입니다!");
				break;
			} else if(random>number) {
				System.out.println("입력한 숫자보다 큽니다.");
			} else {
				System.out.println("입력한 숫자보다 작습니다.");
			}//if
		
			count++; //도전횟수 1씩 증가
			if(count>9) { //도전횟수가 10번인지 확인
				System.out.println("10번을 모두 시도하셨습니다. 프로그램을 종료합니다.");
				count--;
				break;
			}//if
				
		}//while
		
			System.out.println("도전 횟수: "+(count+1)); 
			System.out.print("입력한 숫자: "); //배열을 출력하는 방법
			for(int i=0;i<count+1;i++) {
				System.out.print(arrNum[i]+" ");
			}//for
			
			System.out.println();
			System.out.println("랜덤숫자:"+random);
			
	}//main

}//class
