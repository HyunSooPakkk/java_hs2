package p0905;

public class J0905_07 {

	public static void main(String[] args) {
		// 1-100까지 순번과 합을 출력하시오.
		// for문, While문 순으로 출력하시오.
		
		int i = 0;
		int sum = 0;
//		for(i=1;i<=100;i++) {
//			sum = sum + i;
//			System.out.printf("순번: %d \t", i);
//			System.out.println("합계: "+sum);
//		}//for
		
		i=1;
		while(i<=100) {
		sum = sum +i;
		System.out.printf("순번: %d, 합계: %d \n", i, sum);
		i++;
		}
		
		

	}//main

}//class
