package p0911;

import p0911.Card;

public class J0911_03 {

	public static void main(String[] args) {
		//Card 객체 4개를 선언해서, Heart,1, Spade,1, Diamond,1, Clover,1 출력.

		String[] shape = {"Heart", "Spade", "Diamond", "Clover"};
		
		Card[] c = new Card[52]; //Heart 1-13,Spade 1-13까지 입력 
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(); //객체선언
			c[i].kind = shape[i/13]; //shape: 0-12는 Spade, 13-25는 Heart,
			                         //26-38는 Diamond, 39-51는 Clover 넣으면 됨
			c[i].number = (i%13)+1;
			c[i].cardPrint();
			
		}
		
		
			
	}//main

}//class
