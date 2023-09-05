package p0904_성적폼;

import java.util.Scanner;

public class JA0904_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문자 0에서 9 사이의 문자이면 [문자 숫자입니다.], 그렇지 않다면 [문자 숫자가 아닙니다.] 를 출력하시오.
//		System.out.println("문자를 입력하세요.");
//		char result = scan.next().charAt(0);
//		if(result>='0' && result<='9') {
//			System.out.println("문자 숫자가 입력되었습니다.");
//		} else {
//			System.out.println("문자 숫자가 아닙니다.");
//		}
		
		
		System.out.println("2자리 문자를 입력하세요.");
		String result = scan.nextLine();
		char result1 = scan.next().charAt(0);
		if(result1>='0' && result1<='9') {
			System.out.println("숫자가 입력되었습니다.");
		} else {
			System.out.println("숫자가 아닙니다.");
		}
//		
//		result1 = scan.next().charAt(1);
//		if(result1>='0' && result1<='9') {
//			System.out.println("숫자가 입력되었습니다.");
//		} else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		
		
		
		
//		//알파벳 x,X를 입력해 [프로그램을 종료합니다.] 라고 뜰 수 있게 출력하시오.
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요.");
//		char result = scan.next().charAt(0); //charAt(): 문자열을 문자로 변경해주는 명령어.
//		if(result=='x' || result=='X') {
//			System.out.println("프로그램을 종료합니다.");
//		}
		

	}

}
