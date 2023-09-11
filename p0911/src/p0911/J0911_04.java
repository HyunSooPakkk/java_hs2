package p0911;

import java.util.Scanner;

public class J0911_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("1번째 수를 입력하세요.(0 입력 시 프로그램이 종료됩니다.)");
		int a = scan.nextInt();
		//0을 입력하면 종료
			if(a==0) {
				System.out.println("프로그램을 종료합니다.");
			break;
			}//if
		System.out.println("2번째 수를 입력하세요.");
		int b = scan.nextInt();
		
		
		J0911_04 j = new J0911_04(); //객체선언
		int result = j.max(a, b); //같은 클래스 내에 선언되어 있으면 클래스명 생략 가능
		System.out.println("큰 수: "+result);
			
		}//while
	}
	
	
	
	//static 있으면 클래스변수, 없으면 인스턴스변수
	//static 있으면 클래스메소드, 없으면 인스턴스메소드
	int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}//if
		
	}//main 

}//class
