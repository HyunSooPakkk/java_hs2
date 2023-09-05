package p0905;

public class J0905_03 {

	public static void main(String[] args) {
		
		// 1부터 100까지 1, 3, 5, 7..... 합계를 구해보세요.
		int i = 0;
		int sum = 0;
		for(i=1;i<=100;i+=2) {
			sum = sum + i;
			System.out.printf("%d, ",i); // '+'와 ',' 구분 유의하기.
			System.out.println(sum);
		}
		
		
		
		
//		int i = 0;
//		int sum = 0;
//		for(i=1;i<=100;i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		
//		System.out.println("i: "+(i-1)); //-1 해줘야 올바른 값이 나옴.
//		System.out.println("sum: "+sum);

	}//main

}//class
