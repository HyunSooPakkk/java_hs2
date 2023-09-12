package p0912;

public class J0912_08_Card {

	public static void main(String[] args) {
		//카드 13장 만들어서 Spade를 1-13까지 넣어보세요.
		
		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("-------------");
		d.cardPrint();
		
		System.out.println("카드 한 장 출력: ");
		System.out.println(d.pick(3));
		System.out.println("-------------");
		System.out.println("랜덤카드 한 장 출력: ");
		System.out.println(d.pick());
		
		
		
	}//main

}//class
