package p0906;

public class j0906_06 {

	public static void main(String[] args) {
		char ch = '0'; //아스키코드 48
		char ch1 ='2';
		System.out.println(ch1-'0');
		System.out.println("'2'의 아스키코드: "+(int)ch1);
		System.out.println("'0'의 아스키코드: "+(int)ch);
		System.out.println("--------------------------");
		char ch2 = 'A'; //아스키코드 65
		System.out.println((char)(ch2+32)); //대문자에 32를 더해주면 무조건 소문자 나옴
		char ch3 = 'a'; //아스키코드 97
		System.out.println((char)(ch3-32)); //소문자에 32를 빼주면 무조건 대문자 나옴
	}

}
