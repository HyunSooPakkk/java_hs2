package p0904_성적폼;

public class JA0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합: 5050
		//1부터 100까지의 합에서 합이 200이 넘는 때는 언제일까요? i와 sum을 출력하시오.
		//1. 1부터 100까지의 합을 구함.
		//2. 조건문을 사용해서 sum이 200 이상일때를 구함.
		
		int i = 0, sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum>=200 && sum-i<200) {
				
				
		}
		
		System.out.println("합계: "+sum);
		
		
			
			//정답: i=20, sum=210
		
			
		
			
		}
		
		
		
		
		//1부터 100까지의 합을 출력하시오.
		
//		int i = 0;
//		int sum = 0;
//		for(i=1;i<=100;i++) {
//			
//			sum = sum + i;
//		}
//			System.out.println("합계: "+sum);
			//System.out.printf("1부터 %d까지의 합계: %d \n",i-1,sum);
			//i-1을 하는 이유는 이렇게 해야 조건문을 빠져나올 수 있어서이다.
			
		
	
		//1부터 10까지의 정수를 더하기
//		int i = 0;
//		int sum = 0;
//		for(i=1;i<=10;i++) { //2씩 증가: i=i+2 = i+=2
//			
//			System.out.println(i);
//			sum = sum + i; // sum += 1;
//		}
//		
//		System.out.println("for문 밖 i: "+i);
//		System.out.println("for문 밖 sum: "+sum);

	}//main

}//class
