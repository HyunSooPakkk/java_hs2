package p0904_성적폼;

import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 이하 F 일때
		// 점수를 입력받아 성적을 출력하시오.
		// 98점 이상 A+, 93점 이하 A- , B/C/D 도 마찬가지로 출력.

		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";

		if (score >= 90) {
			// System.out.print("A");
		grade = "A";
			if (score >= 98) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 93) {
				// System.out.println("-");
				grade = grade + "-";
			}
		} else if (score >= 80) {
			// System.out.print("B");
			grade = "B";
			if (score >= 88) {
			// System.out.println("+");
			grade = grade + "+";
			} else if (score <= 83) {
			// System.out.println("-");
			grade = grade + "-";
			}
		} else if (score >= 70) {
			
		}else if (score >= 60) {
			
			
		} else {
			//System.out.print("F");
			grade = "F";
		
		}
			System.out.println("점수: " + score);
			System.out.println("학점: " + grade);
		
	}// main
		
}// class
