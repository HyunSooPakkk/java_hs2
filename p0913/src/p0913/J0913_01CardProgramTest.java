package p0913;

public class J0913_01CardProgramTest {

	public static void main(String[] args) {
		//카드 52장을 생성해서 숫자와 모양을 입력하고, 카드를 섞은 후, 처음부터 5장을 출력하시오.
		//Class ▶ [Card], [Deck], [Main] 3개
		//포함관계Composite(객체선언)로 구성해서 프로그램을 구현하시오.
		
		
		Deck_Test d = new Deck_Test();
		d.cardPrint();
		System.out.println("-----------------");
		d.shuffle();
		d.cardPrint();
		System.out.println("-----------------");
		System.out.println("[카드 5장 뽑기]");
		for(int i=0;i<5;i++) {
			System.out.println(d.pick(i));
		}
		System.out.println("-----------------");
		
		//a:5장 - a라는 카드배열을 만든 후 5장을 저장해서 출력
		//b:5장 - b라는 카드배열을 만든 후 5장을 저장해서 출력
		
		Card_Test[] a = new Card_Test[5];
		Card_Test[] b = new Card_Test[5];
		System.out.println("a: 카드 5장");
		
		for(int i=0;i<5;i++) {
			a[i] = d.pick(i);
			System.out.println(a[i]);
		}
		
		System.out.println("a: 카드 5장");
		for(int i=0;i<5;i++) {
			b[i] = d.pick(i+5);
			System.out.println(b[i]);
		
		}
		
	}//main

}//class
