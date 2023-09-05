package p0905;

public class J0905_13 {

	public static void main(String[] args) {
		int[] score = {500,400,300,200,100,90,80,70,60,50,40,30,20,10,1};
		
		//for문 출력
		for(int i=0;i<10;i++) {   // 길어지면 for(int i=0;i<score.length;i++) { 로 해결
			System.out.println(score[i]);
		}
		
		System.out.println("-------------");
		//개별 출력
			System.out.println(score[0]);
			System.out.println(score[1]);
			System.out.println(score[2]);
			System.out.println(score[3]);
			System.out.println(score[4]);
			System.out.println(score[5]);
			System.out.println(score[6]);
			System.out.println(score[7]);
			System.out.println(score[8]);
			System.out.println(score[9]);
			//.....
	}

}
