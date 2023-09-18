package p0915성적입력프로그램;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();// 객체선언
		String[] title = { "번호", "이름", "국어점수", "영어점수", "수학점수", "합계", "평균", "등수" };

		int stuCount = 1;

		// 무한루프
		loop: while (true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1: // 1.학생 성적 입력 메소드
				stuCount = stuAction.stuInput(stuCount); // 인스턴스 변수는 ~~
				break;

			case 2: // 2.학생 성적 출력 메소드
				stuAction.stuOutput();
				break;

			case 3: // 3.학생 성적 수정 메소드

				stuAction.stuUpdate();
				break;

			case 4: // 4.학생 성적 삭제 메소드

				stuAction.stuDelete();
				break;

			case 5: // 5.학생 성적 검색 메소드

				stuAction.stuSearch();
				break;
				
			case 6: // 6.학생 등수 처리 메소드
				
				
					System.out.println();
					System.out.println("[성적 등수 처리]");
					System.out.printf("등수 처리를 진행할까요?(0.이전 페이지 이동)\n");
					System.out.println("1.예");
					System.out.println("2.아니오");
					System.out.println("0.이전 페이지 이동");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						for(int i=0;i<stuAction.list.size();i++) {
						int count = 1;
						StuScore s = (StuScore)stuAction.list.get(i);
							for(int j=0;j<stuAction.list.size();j++) {
								StuScore s2 = (StuScore)stuAction.list.get(i);	
							if(s.getTotal()<s2.getTotal()) {
								count++;
							}//if
						  }
							s.setRank(count); //등수 입력
						}//for
						System.out.println("등수 처리가 완료되었습니다.");
						System.out.println();
						break;
					case 2:
						System.out.println("등수 처리가 취소되었습니다.");
						System.out.println();
						break;
					case 0:
						System.out.println("이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}//switch
					
					
					break; //case 6 break
				
			
			case 0: // 0.프로그램 종료 메소드
				
				System.out.println();
				System.out.println("[프로그램 종료]");
				System.out.printf("프로그램을 종료합니다.\n");
				break;

			}// switch 각 메뉴
		}// while main 출력
	}// main
}// class
