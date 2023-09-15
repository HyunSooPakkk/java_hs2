package p0915성적입력프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList(); //전체 학생 성적 저장
	
	//메인화면 출력부분
	int mainPrint() {
		System.out.println("--------------------");
		System.out.println("[성적 입력 프로그램]");
		System.out.println("--------------------");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.성적 수정");
		System.out.println("4.성적 삭제");
		System.out.println("5.성적 검색");
		System.out.println("6.등수 처리");
		System.out.println("0.프로그램 종료");
		System.out.println("--------------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice = scan.nextInt();
		return choice;
		
	}//void(int)
	
	//1. 성적 입력 메소드
	int stuInput(int stuCount){
		while(true) {
		System.out.println();
		System.out.println("[성적 입력]");
		System.out.printf("%d번째 학생 이름을 입력하세요.([0]입력 시 이전 페이지로 이동)\n",stuCount);
		String name = scan.next();
		if(name.equals("0")){
			System.out.println(">>이전 페이지로 이동합니다.");
			System.out.println();
			break;
		}//if
		
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		//성적 저장
		list.add(new StuScore(name,kor,eng,math)); //코드의 재사용을 위해 add를 통해 ArrayList에 저장하는 것임.
		
		System.out.printf("%d번째 학생의 성적이 저장되었습니다.\n",stuCount);
		System.out.println();
		stuCount++;
		}//while
		return stuCount++;
		}//stuInput
		
		void stuOutput() {
			String[] title = {"번호","이름","국어점수","영어점수","수학점수","합계","평균","등수"};
			System.out.println();
			System.out.println("[성적 출력]");
			System.out.println("------------------------------------------------------------");
			for(int i=0;i<title.length;i++) {
				System.out.printf("%s\t",title[i]);
			}//for
			System.out.println();
			System.out.println("------------------------------------------------------------");
			for(int i=0;i<list.size();i++) {
				StuScore s = (StuScore)list.get(i);
				//get을 이용해 "학번","이름","국어점수","영어점수","수학점수","합계","평균","등수" 가져오는 것
				System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\t \n",
				s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
				s.getTotal(),s.getAvg(),s.getRank());
			}//for
	  }//stuOutput
}//class
