package p0908;

import java.util.Scanner;

public class J0908_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체 배열 선언
		Time[] t = new Time[3]; //배열 선언 
//		t[0] = new Time(); //1개의 시간 저장 변수 생성
//		t[1] = new Time();
//		t[2] = new Time();
		
		
		//일반 배열 선언
//		int[] hour = new int[3];
//		int[] min = new int[3];
//		double[] sec = new double[3];
		
		for(int i=0;i<3;i++) {
			t[i] = new Time();
			System.out.println("시 입력: ");
			t[i].hour = scan.nextInt();
			System.out.println("분 입력: ");
			t[i].min = scan.nextInt();
			System.out.println("초 입력: ");
			t[i].sec = scan.nextDouble();
		}//for
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d: %d: %.2f\n",
					t[i].hour,t[i].min,t[i].sec);
		}//for
		
	}//main

}//class
