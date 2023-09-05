package p0905;

public class J0905_04 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					System.out.println(i+j+k);
				}
			}
		}
		
		
		// 구구단
//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("[%d단]\n",i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//				//System.out.printf("%d*%d=%d \n",i,j,i*j);
//			} // for
//			System.out.println("--------------------------");
//		} // for

		// 구구단 홀수값만 구하고싶을 때
//		for(int i=2; i<=9;i++) {
//			System.out.printf("[%d단]\n",i);
//			for(int j=1;j<=9;j+=2) {
//				System.out.println(i+"*"+j+"="+(i*j));
//				
//			}//for
//			System.out.println("----------------------");
//		}//for
	
	}// main

}// class
