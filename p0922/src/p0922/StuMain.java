package p0922;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		
		int choice = 0;
		
		//시작시 파일 가져오기
		//s.stuFOpen();
		
		
		loop: while(true) {
			
			System.out.println("--------------------");
			System.out.println("[성적 입력 프로그램]");
			System.out.println("--------------------");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.성적 수정");
			System.out.println("4.성적 삭제");
			System.out.println("5.이름 순 정렬");
			System.out.println("6.성적 낮은 순 정렬");
			System.out.println("7.성적 높은 순 정렬");
			System.out.println("8.파일 가져오기");
			System.out.println("9.파일 저장");
			System.out.println("10.등수 처리");
			System.out.println("0.프로그램 종료");
			System.out.println("--------------------");
			
			//String strCh = JOptionPane.showInputDialog("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			//choice = Integer.parseInt(strCh);
			System.out.println();
			
			switch(choice) {
			
			case 1:
				s.stuInput();
				break;
			
			
			case 2:
				s.stuOutput();				
				break;
			
			
			case 3:
				
				s.stuUpdate();
				break;
			
			
			case 4:
								
				break;
			
			
			case 5: //이름 순 정렬
				s.stuNameSort();		
				break;

			
			case 6: //성적 낮은 순 정렬
				s.stuTotalLowSort();
				break;	
				
			
			case 7: //성적 높은 순 정렬
				s.stuTotalHighSort();
				break;
			
			
			case 8: //파일 가져오기
				s.stuFOpen();
				break;

			
			case 9: //파일 저장하기
				
				s.stuFSave();
				break;
			
			
			case 0:
				System.out.println("[{{{ 프로그램 종료 }}}]");
				System.out.println();
				break loop;
			
			}//switch
			
		}//while
		
	}//main

}//class
