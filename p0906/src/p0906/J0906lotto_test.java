package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906lotto_test {

	public static void main(String[] args) {

		//변수 선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNum = new int[6];
		int[] myNum = new int[6];
		
		//전체 번호 입력
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = i+1;
			}//for
		
		//번호 섞기
			for(int i=0;i<500;i++) {
				int random = (int)(Math.random()*45);
				int temp = lotto[0];
				lotto[0]= lotto[random];
				lotto[random] = temp;
			}//for	
			
			
		//당첨번호 입력
			for(int i=0;i<6;i++) {
				winNum[i] = lotto[i];
			}//for
				Arrays.sort(winNum);
			
		//나의 번호 입력
				
			for(int i=0;i<6;i++) {
				System.out.println("Lotto 번호를 입력하세요.(1-45)");
				myNum[i] = scan.nextInt();
			}//for
			Arrays.sort(myNum);
			
			
		//당첨번호 출력
			System.out.println("----------------------------");
			System.out.println("★2023 LOTTO 제 173회 당첨번호★");
			System.out.println("----------------------------");
			
			System.out.println();
			System.out.print("★당첨 번호★: ");
				for(int i=0;i<6;i++) {
					if(i==0);
					System.out.print(winNum[i]+" ");
					continue;
				}//for
			System.out.println();		
		
			//나의 번호 출력
			System.out.print("나의 입력 번호: ");
			for(int i=0;i<6;i++) {
				System.out.print(myNum[i]+" ");
				continue;
			}//for
			System.out.println();
			
	}//main

}//class
