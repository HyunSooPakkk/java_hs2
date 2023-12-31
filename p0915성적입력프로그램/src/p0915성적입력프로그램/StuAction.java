package p0915성적입력프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList(); //전체 학생 성적 저장
	String[] title = {"번호","이름","국어점수","영어점수","수학점수","합계","평균","등수"};
	
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
			System.out.println("------------------------------------------------------------");
			System.out.println();
	  }//stuOutput
		//성적 수정 메소드
			void stuUpdate() {
				while(true) {
					
					System.out.println();
					System.out.println("[성적 수정]");
					System.out.printf("찾고자 하는 학생 이름을 입력하세요.([0]입력 시 이전 페이지로 이동)\n");
					String name = scan.next();
					if(name.equals("0")){ //이전 페이지 이동
						System.out.println(">>이전 페이지로 이동합니다.");
						System.out.println();
					break;	
					}
					
					
					//홍길동
					int count = -1; //0,1,2..... 이런 식으로 방 배정이 되니까
					for(int i=0;i<list.size();i++) {
						
						StuScore s = (StuScore)list.get(i);
						if(name.equals(s.getName())) {
							count = i; //찾은 방 번호
							System.out.printf("%s 학생을 찾았습니다.\n",name);
							System.out.println("[수정 과목 선택]");
							System.out.println("1.국어");
							System.out.println("2.영어");
							System.out.println("3.수학");
							System.out.println("-----------------------------");
							System.out.println("원하는 번호를 선택하세요.");
							int choice = scan.nextInt();
							
							switch(choice) {
							case 1:
								System.out.println("[국어과목 수정]");
								System.out.println("-----------------------------");
								System.out.println("현재점수: "+s.getKor());
								System.out.println("변경할 점수를 입력하세요.");
								s.setKor(scan.nextInt()); //입력 후 바로 국어점수에 저장
								s.setTotal(s.getKor()+s.getEng()+s.getMath()); //점수를 읽은 후 바로 토탈에 저장
								s.setAvg(s.getTotal()/3.0); //평균 수정
								
								System.out.println("국어점수가 변경되었습니다.");
								System.out.println();
								break;
								
							case 2:
								System.out.println("[영어과목 수정]");
								System.out.println("-----------------------------");
								System.out.println("현재점수: "+s.getEng());
								System.out.println("변경할 점수를 입력하세요.");
								s.setEng(scan.nextInt()); //입력 후 바로 영어점수에 저장
								s.setTotal(s.getKor()+s.getEng()+s.getMath()); //점수를 읽은 후 바로 토탈에 저장
								s.setAvg(s.getTotal()/3.0); //평균 수정
								
								System.out.println("영어점수가 변경되었습니다.");
								System.out.println();
								break;
								
							case 3:
								System.out.println("[수학과목 수정]");
								System.out.println("-----------------------------");
								System.out.println("현재점수: "+s.getMath());
								System.out.println("변경할 점수를 입력하세요.");
								s.setMath(scan.nextInt()); //입력 후 바로 수학점수에 저장
								s.setTotal(s.getKor()+s.getEng()+s.getMath()); //점수를 읽은 후 바로 토탈에 저장
								s.setAvg(s.getTotal()/3.0); //평균 수정
								
								System.out.println("수학점수가 변경되었습니다.");
								System.out.println();
								break;	
							
						   }//switch
						 }//if
					   }//for
					
						if(count==-1) {
							System.out.printf("※찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.※\n",name);
							System.out.println();
							
						}
						}//if
						
				
			}//stuUpdate
				
			
			//성적 삭제 메소드
				void stuDelete() {
					
					while(true) {
						System.out.println();
						System.out.println("[성적 삭제]");
						System.out.printf("성적을 삭제하고자 하는 학생 이름을 입력하세요.([0]입력 시 이전 페이지로 이동)\n");
						String name = scan.next();
						if(name.equals("0")){ //이전 페이지 이동
							System.out.println(">>이전 페이지로 이동합니다.");
							System.out.println();
							break;	
						}//if
						
						
						int count = -1; //0,1,2..... 이런 식으로 방 배정이 되니까
						for(int i=0;i<list.size();i++) {
							
							StuScore s = (StuScore)list.get(i);
							if(name.equals(s.getName())) {
								count = i; //찾은 방 번호
								System.out.printf("%s 학생을 찾았습니다.\n",name);
								System.out.println("[삭제 선택]");
								System.out.println("1.예");
								System.out.println("2.아니오");
								
								System.out.println("-----------------------------");
								System.out.println("원하는 번호를 선택하세요.");
								int choice = scan.nextInt();
								
								switch(choice) {
								case 1:
									list.remove(i);
									System.out.printf("%s 학생의 성적이 삭제되었습니다.\n",name);
									System.out.println();
									break;
									
								case 2:
									System.out.printf("%s 학생의 성적이 취소되었습니다.\n",name);
									System.out.println();
									break;
									
							   }//switch
							 }//if
						   }//for
						
							if(count==-1) {
								System.out.printf("※찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.※\n",name);
								System.out.println();
							}
					}//while
					
				}//stuDelete
				
				//성적 검색 메소드
				void stuSearch() {
					
					while(true) {
					System.out.println();
					System.out.println("[성적 검색]");
					System.out.printf("찾고자 하는 학생 이름을 입력하세요.([0]입력 시 이전 페이지로 이동)\n");
					String name = scan.next();
					if(name.equals("0")){ //이전 페이지 이동
						System.out.println(">>이전 페이지로 이동합니다.");
						System.out.println();
					break;	
					}
					
					int count = -1; //0,1,2..... 이런 식으로 방 배정이 되니까
					for(int i=0;i<list.size();i++) {
						
						StuScore s = (StuScore)list.get(i);
						if(name.equals(s.getName())) {
							count = i; //찾은 방 번호
							System.out.printf("%s 학생을 찾았습니다.\n",name);
							
							System.out.println();
							System.out.printf("[%s 학생 성적 출력]\n",name);
							System.out.println("------------------------------------------------------------");
							for(int j=0;j<title.length;j++) {
								System.out.printf("%s\t",title[j]);
							}//for
							System.out.println();
							System.out.println("------------------------------------------------------------");
								System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\t \n",
								s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
								s.getTotal(),s.getAvg(),s.getRank());
							
							System.out.println("------------------------------------------------------------");
							System.out.println();
							break; //for문 break
							
						 }//if
					   }//for
					
						if(count==-1) {
							System.out.printf("※찾고자 하는 %s 학생이 없습니다. 다시 입력하세요.※\n",name);
							System.out.println();
							
						}//if
				     }//while
				}//stuSearch
}//class
