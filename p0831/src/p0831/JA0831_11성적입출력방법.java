package p0831;

import java.util.Scanner;

public class JA0831_11성적입출력방법 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //입력선언
		
		//이름, 국어, 영어, 수학, 합계, 평균
		
	
		String name = " ";
		int kor=0;
		int eng=0;
		int math=0;
		
		//입력라인
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("이름: "+name);
		
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		
		
		
		// 합계, 평균, 계산이 입력라인 밑에 있어야 올바른 값이 나옴
		int total= kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("이름: %s \n",name );
		System.out.printf("국어: %d, 영어: %d, 수학: %d \n", kor,eng,math);
		System.out.printf("합계: %d \n", total);
		System.out.printf("평균: %.2f \n", avg);
		
		
		
		
	
		
	}

}
