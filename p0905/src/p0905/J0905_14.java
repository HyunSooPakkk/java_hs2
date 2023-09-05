package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		// Question: 1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
				// H1. 랜덤숫자 생성
				// H2. while 무한루프
				// H3. input 숫자입력받기
				// H4. if를 사용해서 랜덤숫자와 입력숫자가 맞는지 비교
				// H5. "입력한 숫자보다 큰 수/작은 수 입니다." notice
				// H6. 정답일 때 break; 사용
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10]; // 배열 10개 생성
		int random = (int)(Math.random()*100)+1;
		int i = 0; // 초기값

		while(i<10) {
			System.out.println("1-100 사이의 숫자를 입력하세요.>>");
			int input = scan.nextInt();
			num[i] = input;             // 입력한 숫자를 배열에 저장

			if (random == input) {
				System.out.println("정답입니다!");
				break;
			} else if(random>input) {
				System.out.println("입력한 숫자보다 큰 수 입니다.");
				System.out.println();
			} else {
				System.out.println("입력한 숫자보다 작은 수 입니다.");
			}
			
			if(i==10) {
				break;
			}
			i++; // 증감식

		}// while

			System.out.print("입력한 숫자: ");
			for(int j=0;j<i;j++) {
				System.out.printf("%d ",num[j]);
			}
			System.out.println();
			System.out.println("랜덤숫자: "+random);

//		System.out.println(num); //주소값 출력됨
//		System.out.println();
//		System.out.println(Arrays.toString(num)); //배열의 모든 값을 출력(참고)
		
		
	}// main
}// class
