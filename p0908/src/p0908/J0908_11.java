package p0908;

import java.util.Scanner;

public class J0908_11 {

	public static void main(String[] args) {
		//3개의 점수를 입력받아 합계와 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		int kor = 100;
		int eng = 99;
		int math = 80;
		
		System.out.println("합계: "+total(kor,eng,math));
		System.out.println("평균: "+avg(kor,eng,math));
		
		
		
		

	}//main
	//리턴타입 메소드명(매개변수명, 매개변수명, 매개변수명)
	static int total(int kor, int eng, int math) {
		return kor+eng+math; //리턴타입과 결과값은 무조건 일치해야한다
	}

	static double avg(int kor, int eng, int math) {
		return (kor+eng+math)/3.0;
	}
	
}//class
