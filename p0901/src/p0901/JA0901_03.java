package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a*b;
//		System.out.printf("%,d",c); -> 숫자 사이에 콤마 넣어준다는 표시
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		char c4 = (char)(c2+1);  
		System.out.println(c4);
		char c5 = ++c1;
		System.out.println(c5);
		char c6 = '0';
		System.out.println((char)(c6+1));
		
		int i = '4'-'0';
		System.out.println(i);
		int i2 = '7'-'0';  // 문자형 숫자를 int타입으로 변경하는 방법은 '0'을 빼주면 됨. int 타입 변경.
		System.out.println(i2);
		
		
		
		
		

	}

}
