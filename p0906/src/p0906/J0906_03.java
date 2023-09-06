package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// arrKor (국어점수) 5개 배열 생성 후 점수를 직접 입력 및 출력하시오.

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] arrKor = new int[5];
		int[] arrEng = new int[5];

		//입력 부분
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println((i + 1) + "번째 국어점수를 입력하세요.");
			arrKor[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 영어점수를 입력하세요.");
			arrEng[i] = scan.nextInt();
		}

		System.out.print("입력한 이름: ");
		for (int i = 0; i < name.length; i++) {
			if (i == 0) {
				System.out.print(name[i]);
				continue;
			}
			System.out.print("," + name[i]);
		}//for
		
		System.out.println();

		System.out.print("입력한 국어 점수: ");
		for (int i = 0; i < arrKor.length; i++) {
			if (i == 0) {
				System.out.print(arrKor[i]);
				continue;
			}
			System.out.print("," + arrKor[i]);
		}// for
		
		System.out.println();

		System.out.print("입력한 영어 점수: ");
		for (int i = 0; i < arrEng.length; i++) {
			if (i == 0) {
				System.out.print(arrEng[i]);
				continue;
			}
			System.out.print("," + arrEng[i]);
		}//for

	}// main

}// class
