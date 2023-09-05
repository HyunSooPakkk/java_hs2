package p0901;

import java.util.Scanner;

public class JA0901_06 {

	public static void main(String[] args) {
//		System.out.println(10/8);  //1 (몫)
//		System.out.println(10%8);  //2 (나머지)
		
		// 입력받은 숫자가 음수 또는 양수인지 알고싶을 때
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		int result = num%3; // 0 또는 1이 들어가있음
		//조건문
		if(result==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		System.out.println("입력한 숫자: "+num);
		
		// 입력받은 숫자가 배수인지 아닌지 알고싶을 때: % 뒤쪽 숫자와 조건문만 바꿔주면 됨
		
		
		
		
		
		
		

	}

}
