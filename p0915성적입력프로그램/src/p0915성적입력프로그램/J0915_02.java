package p0915성적입력프로그램;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();//객체선언
		
		int stuCount = 1;

		
		//무한루프
		while(true) {
			//메인화면 출력부분
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1: //1.학생 성적 입력 메소드
				stuCount = stuAction.stuInput(stuCount); //인스턴스 변수는 ~~
				break;
				
			case 2: //2.학생 성적 출력 메소드	
				stuAction.stuOutput();
				break;
				
			case 3: //2.학생 성적 수정 메소드	
				
				break;	
				
				}//switch
			
			}//while
		
		}//main

	}//class
