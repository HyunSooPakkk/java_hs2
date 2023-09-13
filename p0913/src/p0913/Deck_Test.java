package p0913;

public class Deck_Test {
	String[] shape = {"Heart", "Spade", "Diamond", "Clover"};
	Card_Test[] c = new Card_Test[52];

	
	Deck_Test() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card_Test();
			c[i].kind = shape[i/13];
			c[i].number = i%13+1;
			
		}//for
	}//Deck		


	//Pick specific card number 
		Card_Test pick(int no) {
			if(no>52) {
				System.out.println("숫자를 잘못 선택하셨습니다.");
				return c[no%52];
			}
			return c[no];
		}

	//Pick random card number
		Card_Test pick() {
			int random = (int)(Math.random()*52);
			return c[random];
		}

	//Mix cards
		void shuffle() {
			for(int i=0;i<1000;i++) {
				int random = (int)(Math.random()*52);
				Card_Test temp = c[0];
				c[0] = c[random];
				c[random] = temp;
			}//for
		}
	//All cards print out method
			void cardPrint() {
				for(int i=0;i<c.length;i++) {
					System.out.println(c[i]);
				}//for
		}//void
}//Class
