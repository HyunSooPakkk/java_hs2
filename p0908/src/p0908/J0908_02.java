package p0908;

import java.util.Scanner;

public class J0908_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//시,분,초
		int[] hour = new int[3];
		int[] min= new int[3];
		double[] sec = new double[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("시간 중 시를 입력하세요.");
			hour[i] = scan.nextInt();
			System.out.println("시간 중 분을 입력하세요.");
			min[i] = scan.nextInt();
			System.out.println("시간 중 초를 입력하세요.(예:45.02)");
			sec[i] = scan.nextDouble();
			
		}//for
		
		//2번째 것만 입력한 시간을 출력하시오. 예) 12:12:12.05
		System.out.printf("%d:%d:%.2f\n",hour[1],min[1],sec[1]);
		
		//2번째 시간을 14:14:14.55 로 변경해서 출력하시오.
		//변경
		hour[1] = 14;
		min[1] = 14;
		sec[1] = 14.55;
		System.out.printf("%d:%d:%.2f\n",hour[1],min[1],sec[1]);
		
		//3번째 시간 중 sec를 59.10으로 변경해서 시/분/초를 모두 출력하시오.
		
		sec[2] = 59.10;
		System.out.printf("%d:%d:%.2f\n",hour[2],min[2],sec[2]);
		
		
	}//main

}//class
