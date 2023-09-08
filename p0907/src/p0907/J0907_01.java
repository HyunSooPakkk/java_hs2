package p0907;

public class J0907_01 {

	public static void main(String[] args) {
		//1차원 배열
		int[] score = new int[10];
		//score에 1-10까지 숫자를 입출력하세요.
		for(int i=0;i<score.length;i++) {
			score[i] = i+1;
			System.out.println(score[i]); //System.out.print(score[i]+" ");
		}//for
		System.out.println();
		System.out.println("--------------------");
		
		//2차원 배열: [공식]▶(두 수중 뒤의 숫자)*i+(j+1)
		//입력
		int[][] num = new int[5][3];
			for(int i=0;i<5;i++) {         //i<5 = i<num.length
				for(int j=0;j<3;j++) {     //j<3 = j<num[i].length
					num[i][j] = (3*i)+j+1;
				}//for
			}//for
		//출력
			for(int i=0;i<5;i++) {         
				for(int j=0;j<3;j++) {
					System.out.print(num[i][j]+"\t ");
				}//for
				System.out.println();
			}//for
			
	}//main

}//class
