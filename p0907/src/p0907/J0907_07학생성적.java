package p0907;

import java.util.Scanner;

public class J0907_07학생성적 {

	public static void main(String[] args) {
		//학생성적프로그램
		//선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0; //학생 수
		String[] subject = {"국어","영어","수학"};
		String[] title = {"학번","이름","국어","영어","수학","합계","평균",};
		int[] stuNum = new int[10]; //학번
		String name[] = new String[10]; //이름
		int[][] score = new int[10][3]; //점수: 국영수
		int[] total = new int[10]; //총합
		double[] avg = new double[10]; //평균
		
		loop: while(true) { //무한반복 loop 이름 지정해야 프로그램 종료 시 빠져나올 수 있음
		//화면 출력
		System.out.println("--------------------------");
		System.out.println("-------학생성적프로그램--------");
		System.out.println("--------------------------");
		System.out.println("[1.성적 입력]");
		System.out.println("[2.성적 출력]");
		System.out.println("[3.성적 수정]");
		System.out.println("[0.종료]");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		choice = scan.nextInt();
		System.out.println();
		
		//메뉴별 선택
		switch(choice) {
		case 1:
			System.out.println("[성적입력화면]");
			System.out.println("----------------------");
				for(int i=count;i<10;i++) {
					stuNum[i] = count+1;
					System.out.println();
					System.out.println((count+1)+"번째 이름을 입력하세요.(*이전화면 -> 0 입력)");
					name[i] = scan.next();
					if(name[i].equals("0")) { //0인지 확인
						System.out.println();
						break;
					}
					
					//과목 입력
					for(int j=0;j<3;j++) {
					System.out.println(subject[j]+"점수를 입력하세요.");
					score[i][j] = scan.nextInt();
					
					
				}//for
					
					//합계
					total[i] = score[i][0]+score[i][1]+score[i][2];
					//평균
					avg[i] = total[i]/3.0;
					
					count++; //성적입력 1 증가	
					
					}
			
			System.out.println();
			break;
			
		case 2:
			System.out.println("----------------------------------------------------");
			System.out.println("                 학생 성적 출력");
			System.out.println("----------------------------------------------------");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
			System.out.println("-------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",stuNum[i]);
					System.out.printf("%s\t",name[i]);
					
					//점수
						for(int j=0;j<3;j++) {
							System.out.printf("%d\t",score[i][j]);
						}
					
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\t",avg[i]);
				}
			
			
			System.out.println();
			break;
			
			
			
		case 0:
			System.out.println("[프로그램 종료]");
			System.out.println();
			break loop;
			
			}//switch
		
		}//while
		
	}//main

}//class
