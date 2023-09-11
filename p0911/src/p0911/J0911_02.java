package p0911;

public class J0911_02 {

	public static void main(String[] args) {
		//배열을 선언 후 반복문을 이용, 데이터를 추가해서 출력하는 방법
		
		String[] shape = {"Heart", "Spade", "Diamond", "Clover"};
		
		Card[] c = new Card[4];
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(); 
			c[i].kind = shape[i];
			c[i].number = 1;
			c[i].cardPrint();
		}
		
		
		//각각의 카드 객체를 선언 후, 각각에 데이터를 추가해서 출력하는 방법
		Card c1 = new Card(); //객체선언 - 참조변수명.변수명
		c1.kind = "Heart";
		c1.number = 1;
		c1.cardPrint();
	
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		c2.cardPrint();
		
		Card c3 = new Card();
		c3.kind = "Diamond";
		c3.number = 1;
		c3.cardPrint();
		
		Card c4 = new Card();
		c4.kind = "Clover";
		c4.number = 1;
		c4.cardPrint();
		
		
		// int a; //변수선언 후 값을 지정하지 않고 사용하면 에러
		// System.out.println(a);
		
		//원래는 아래처럼 썼음
		//String kind = "Heart";
		//int number = 1;

	}

}
