package p0906;

import java.util.Arrays;

public class J0906_07 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int[] num = {1,2,3}; //주소값(@어쩌구)만 넣을 수 있다. 중괄호 안에 숫자를 넣어야 값이 들어감.
		num = score; //***주소를 복사*** 값을 복사한 것은 아님.
		
		System.out.println(Arrays.toString(score));
		
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}//for
			System.out.println(score);  //주소값 나옴
				System.out.println(num);//같은 주소값 나옴
				
				num[0] = 10000;
				System.out.println(num[0]);
				System.out.println(score[0]);
				
	}//main

}//class
