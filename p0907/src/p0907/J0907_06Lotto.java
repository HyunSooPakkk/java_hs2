package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_06Lotto {

	public static void main(String[] args) {
		//로또 프로그램
		//각주 순서대로 외우기 변전번당나당나당
		Scanner scan = new Scanner(System.in);
		
		//변수 선언
		int[] lotto = new int[45];
		int[] winNum = new int[6];
		int[] myNum = new int[6];
		int temp = 0, count =0;
		
		//전체 번호 입력
			
			for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; //1-45
	}//for
	
		//번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
			}//for
		
		//당첨번호 입력
			for(int i=0;i<6;i++) {
				winNum[i] = lotto[i];
				
				
				
			}//for
			System.out.println(Arrays.toString(winNum));
			System.out.println("---------------------------------");
			System.out.println("▶ 2023 LOTTO 제 173회 번호 입력 ◀");
			System.out.println("---------------------------------");
			
		//나의 번호 입력
			System.out.println("로또 번호를 입력하세요.");
			for(int i=0;i<6;i++) {
				myNum[i] = scan.nextInt();
			}//for
			
			
		//당첨번호 출력
			System.out.println("---------------------------------");
			System.out.println("★★★2023 LOTTO 제 173회 당첨 확인★★★");
			System.out.println("---------------------------------");
			
			System.out.println();
			System.out.print("★당첨 번호★: ");
				for(int i=0;i<6;i++) {
					System.out.printf("%d ",winNum[i]);
				}//for
				System.out.println();
				
		//나의 번호 출력		
				
				System.out.printf("★나의 번호★: ");
					for(int i=0;i<6;i++) {
						System.out.printf("%d ",myNum[i]);
					}//for
				System.out.println();		

		//당첨 번호 개수 확인
				for(int i=0;i<6;i++) {
					for(int j=0;j<6;j++) {
						if(winNum[i]==myNum[j]) {
							count++;
							break; //loop가 없으면 j에서만 빠져나올 수 있음
						}
					}
				}//for
		
				System.out.println("※당첨 갯수※: "+count);
				
	}//main

}//class
