package p0901;

import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.");  // 27->2,7로 분리해야 함.
		String number = scan.next();
		
		
		// String 분리
		char ch1 = number.charAt(0);  // String은 한 글자당 주소가 0,1,2 순서로 배정된다. 가나1953: 012345 이렇게 해당주소값을 char타입으로 가져옴.
		char ch2 = number.charAt(1);
		
		
		// char 타입을 int 타입으로 변경
		int n1 = ch1 - '0';  // '0' = 48
		int n2 = ch2 - '0';
		int result = n1+n2;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("두 수 더한 값: "+result);
		
		// char ch3 = '2'; // '0' = 48
		

	}

}
