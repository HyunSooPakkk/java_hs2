package p0921;

public class J0921_10 {

	public static void main(String[] args) {
		//52장의 카드를 출력하시오.
		ColAction2 col = new ColAction2(); //객체선언 잊지말기 젭알
		Card[] card = col.cardInsert();
		
			for(int i=0;i<card.length;i++) {
				System.out.println(card[i].getKind()
				+","+card[i].getNumber());
			}//for
		
	}//main

}//class
