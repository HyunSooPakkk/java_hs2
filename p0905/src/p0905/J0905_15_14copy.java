package p0905;

import java.util.Scanner;

public class J0905_15_14copy {

	public static void main(String[] args) {
		// Question: 1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		// H1. 랜덤숫자 생성
		// H2. while 무한루프
		// H3. input 숫자입력받기
		// H4. if를 사용해서 랜덤숫자와 입력숫자가 맞는지 비교
		// H5. "입력한 숫자보다 큰 수/작은 수 입니다." notice
		// H6. 정답일 때 break; 사용
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int random = (int)(Math.random()*100)+1;
		int num[] = new int[10];
		
		while(i<10) {
			System.out.println("1-100까지의 숫자를 입력하세요.");
			int input = scan.nextInt();
			num[i] = input;
			
			if(random==input) {
				System.out.println("정답입니다!");
			} else if(random>input) {
				System.out.println("입력한 숫자보다 큰 수 입니다.");
				System.out.println();
			} else {
				System.out.println("입력한 숫자보다 작은 수 입니다.");
			}
			
			i++;
			
			}//while
			System.out.println("입력한 숫자: ");
				for(int j=0;j<i;j++) {
					System.out.printf("%d ",num[j]);
		
		    System.out.println("랜덤 숫자: "+random);
		}
		

	}

}
