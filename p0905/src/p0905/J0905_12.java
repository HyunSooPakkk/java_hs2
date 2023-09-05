package p0905;

public class J0905_12 {

	public static void main(String[] args) {
		//배열 
		int[] score = new int[10];
		
		for(int i=0;i<10;i++) {
			score[i] = i+10;
		}
		
		//값을 넣을 수 있는 방법
		
		//중괄호 안에 넣기
		int[] number = {1,6,5,7,9,10,20};
		
		//하나하나 넣기
		int[] num = new int[5];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		num[4] = 4;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		//for문(가장 많이 씀)
		for(int i=0;i<=5;i++) {
			System.out.println(num[i]); //10만개 쓰고싶으면 조건문에 10만 넣으면 됨
			
		}//for
		
	}//main

}//class
