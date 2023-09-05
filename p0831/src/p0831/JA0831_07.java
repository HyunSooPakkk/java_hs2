package p0831;

public class JA0831_07 {

	public static void main(String[] args) {
		double d = 1.6;
		int i = (int)d;  //강제타입변환. 강제로 int 타입으로 바뀌는 거라 소수점 이하 숫자가 날아가버림. 정수부분만 입력됨
		System.out.println(i);
		
		int x = 10;
		double d2 = x; //자동타입변환. 작은 쪽에서 큰 쪽으로 갈 때는 타입변환 생략가능
		System.out.println(d2);
		
		// 크기 순서: char,byte,short < int < long < float < double < String 
		
		System.out.println(10/3.0F);
		// 실수형 값은 %f, 정수형 값은 %d, 문자열 값은 %s
		System.out.printf("%.2f \t", 10/3.0);  // \n: 줄바꿈  \t: 사이띄움
		System.out.println("안녕하세요.");
		System.out.printf("%s \n","홍길동입니다.");
		System.out.printf("%,015d \n", 100000000);  // ,: 천단위 표시 | 숫자 앞 0: 남는 자리 0으로 채움
		System.out.printf("국어: %d, 영어: %d \n", 100,99);
		

	}

}
