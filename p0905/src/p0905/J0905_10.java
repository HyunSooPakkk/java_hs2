package p0905;

public class J0905_10 {

	public static void main(String[] args) {
		// 구구단(2~9단)을 for문으로 구현하시오.
		for(int i=2;i<=9;i++) {
			//if(i%2==1) {
				//continue;    //짝수단만 출력하고 싶을 때
			//}
			//if(i%2==0) {
				//continue;    //홀수단만 출력하고 싶을 때
			//}
			System.out.printf("[%d단]\n",i);
			for(int j=1;j<=9;j++) {
				if(j%2==0) {
					continue;  //곱해지는 숫자를 홀수로만 출력하고 싶을 때: 9*1 / 9*3 / 9*5 ...
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-------");  //구구단 for문 제발 외워
		}
		
		
//		for(int i=1;i<=10;i++) {
//			if(i%3==0) {
//				//break; //반복문을 완전히 멈춤
//				continue; //1번 멈춤
//			}
//			System.out.println(i);
//		}//for

	}//main

}//class
