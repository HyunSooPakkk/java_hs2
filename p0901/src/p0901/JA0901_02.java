package p0901;

import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt(); // 엔터키값은 입력을 받지 않음.
		scan.nextLine(); // 입력된 엔터키 적용하는 줄
		System.out.println("이름을 입력하세요.");
		// String name = scan.next();
		String name = scan.nextLine(); // 문장만 입력 가능, 사이 띄우기 안 됨.
		System.out.println("이름: "+name);
		
		System.out.println("국어점수를 입력하세요.");
		String k = scan.nextLine(); //nextLine은 문자열을 입력받는 명령어
		int kor = Integer.parseInt(k); // String을 Int타입으로 변경하는 명령어. 8가지 기본형 타입이면 형변환
		System.out.println("영어점수를 입력하세요.");
		String e = scan.nextLine();
		int eng = Integer.parseInt(e);
		System.out.println("합계: "+(k+e));
		
		
		

	}

}
