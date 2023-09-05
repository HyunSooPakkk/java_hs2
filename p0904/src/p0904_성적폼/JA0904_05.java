package p0904_성적폼;

import java.util.Scanner;

public class JA0904_05 {

	public static void main(String[] args) {
		// 두 수를 입력받아 [큰 수: ] 출력하시오.
		// 1. 두 수 입출력 , 2. 두 수를 비교해서 큰 수만 출력.
		
		Scanner scan = new Scanner(System.in);
			// 두 수를 입력	
			System.out.println("첫 번째 숫자를 입력하세요.");
			int num1 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			int num2 = scan.nextInt();
			
			// 두 수를 비교
			
			if(num1>num2) {
			System.out.println("큰 수: "+num1);
			System.out.println("작은 수: "+num2);
			} else if(num1<num2) {
			System.out.println("큰 수: "+num2);
			System.out.println("작은 수: "+num1);
			} else {
				System.out.println("두 수가 같습니다.");
			}
			
			
			//두 수를 출력
			System.out.printf("1:%d, 2:%d",num1,num2);
			
			
				

	}//main

}//class
