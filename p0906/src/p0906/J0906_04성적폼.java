package p0906;

import java.util.Scanner;

public class J0906_04성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		int count = 0; //입력된 학생 수
		double[] avg = new double[10];
		
		loop1: while(true) { //무한반복
			System.out.println("[학생성적프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 종료");
			System.out.println("-----------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			
			int choice = scan.nextInt();
			scan.nextLine();
		
			switch(choice) {
			case 1:
				System.out.println("[[성적 입력 선택]]");
				System.out.println("----------------------------");
				//입력 부분
				for (int i = count; i < name.length; i++) {
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요.(이전 화면으로 돌아가려면 0을 입력하세요.)");
					name[i] = scan.next(); //"0" String
					if(name[i].equals("0")) {
						System.out.println("입력을 중지합니다.");
						break;
					}
					System.out.println((i + 1) + "번째 학생의 국어점수를 입력하세요.");
					arrKor[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 학생의 영어점수를 입력하세요.");
					arrEng[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 학생의 수학점수를 입력하세요.");
					arrMath[i] = scan.nextInt();
					scan.nextLine();
					total[i] = arrKor[i]+arrEng[i]+arrMath[i]; //합계 입력
					avg[i] = total[i]/3.0; //평균 입력
					
					count++; 
				
				}//for
				System.out.println();
				break;
				
			case 2:
				System.out.println("[[성적 출력 선택]]");
				System.out.println("----------------------------");
				
				System.out.println();
				System.out.println("[1학년 1학기 성적표]");
				System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("--------------------------------------------------------");
				
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.3f\n",
							i+1,name[i],arrKor[i],arrEng[i],arrMath[i], total[i],avg[i]);
				}//for
				System.out.println();
				break;
				
			case 3:
				System.out.println("성적 수정을 선택하셨습니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break loop1;  // 무한루프 빠져나오려면 while문 앞에 네이밍 해주면 됨
			}//switch
			
		}//while
		
	

	}//main

}//class
