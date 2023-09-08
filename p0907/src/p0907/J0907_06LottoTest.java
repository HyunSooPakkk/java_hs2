package p0907;

import java.util.Scanner;

public class J0907_06LottoTest {

	public static void main(String[] args) {
		//로또 자동 프로그램을 구현하시오.
		//변수 선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNum = new int[6];
		int[] myNum = new int[6];
		int temp = 0, count = 0;
		
		
		//전체 번호 입력
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = i+1;
	    }//for
			
			
		//번호 섞기
			for(int i=0;i<400;i++) {
				int random = (int)(Math.random()*45);
				temp = lotto[0];
				lotto[0] = lotto[random];
				lotto[random] = temp;
			}//for
		
		
		//당첨 번호 입력
			for(int i=0;i<6;i++) {
				winNum[i] = lotto[i];
			}//for
			
		
		//나의 번호 입력
			System.out.println("---------------------------------------------");
			System.out.println("-------▶ 2023 LOTTO 제 173회 번호 입력 ◀-------");
			System.out.println("---------------------------------------------");
			
				for(int i=0;i<6;i++) {
					winNum[i] = scan.nextInt();
				}//for
		
		//당첨 번호 출력
			System.out.println("---------------------------------------------");
			System.out.println("-------★ 2023 LOTTO 제 173회 당첨 번호 ★-------");
			System.out.println("---------------------------------------------");
			System.out.println();

			System.out.print("★당첨 번호★: ");
			for(int i=0;i<6;i++) {
				System.out.printf("%d ",winNum[i]);
			}//for
			System.out.println();
				
		//나의 번호 출력
			System.out.print("★나의 번호★: ");
			for(int i=0;i<6;i++) {
				System.out.printf("%d ",myNum[i]);
			}//for
		System.out.println();
		
		//당첨 갯수 확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(myNum[i]==winNum[j]) {
					count++;			
					break;
				}
			}
		}//for
			
		System.out.println("＃당첨 갯수＃: "+count);
		
		
	}//main

}//class
