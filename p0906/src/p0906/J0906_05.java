package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_05 {

	public static void main(String[] args) {
		// 자동 로또 프로그램
		
		//선언 부분
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45]; // 1-45개 번호
		int[] winNum = new int[6]; // 당첨 번호
		int[] myNum = new int[6]; //내가 입력한 번호
		
		// 1-45 전체 번호 입력 부분
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for
		
		// 번호 섞기 부분
		for(int i=0;i<500;i++) { //500번 섞어주세여 라는 의미
			int random = (int)(Math.random()*45); //방 번호 0-44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;   // temp는 임시 저장공간
		}//for
		
		// 당첨 번호 입력
		for(int i=0;i<6;i++) {
			winNum[i] = lotto[i]; // 당첨 번호
		}
				Arrays.sort(winNum); // 낮은 수부터 순차정렬
		
		// 내 번호 입력
			for(int i=0;i<6;i++) {
				System.out.println("로또 번호를 입력하세요.(1-45)");
				myNum[i] = scan.nextInt();
			}
				Arrays.sort(myNum); // 낮은 수부터 순차정렬
				
		// 번호 출력
			System.out.println("------------------------------");
			System.out.println("▶ 2023 LOTTO 107회차 당첨 번호 ◀");
			System.out.println("------------------------------");
			
			
		// 나의 번호 출력
			System.out.print("나의 입력 번호: ");
			for(int i=0;i<6;i++) {
				System.out.print(myNum[i]+" ");
				continue;
			}
			System.out.println();
			
		// 당첨 번호 출력
			System.out.print("★당첨번호★: ");
		for (int i = 0; i < 6; i++) {
			if(i==0) {
			System.out.print(winNum[i]);
			continue;
		}
			System.out.print("," + winNum[i]);
	
		}//for
		
		System.out.println();
		
	}//main

}//class
