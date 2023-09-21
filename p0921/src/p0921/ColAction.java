package p0921;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColAction {

	Card[] card = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	
	//학생 3명 리스트
	HashMap<String, Object> scoreAll() {
			list.add(new StuScore("홍길동",100,100,90));
			list.add(new StuScore("유관순",90,100,90));
			list.add(new StuScore("이순신",80,90,100));
			
		
		//자동차 3대 리스트
		
			list2.add(new Car("White",5));
			list2.add(new Car("Red",4));
			list2.add(new Car("Black",5));
			
			map.put("list", list);
			map.put("list2", list2);
			
			return map;
		}//void
	
	
	
	
//	//학생 3명 리스트
//	ArrayList<StuScore> scoreAll() {
//		list.add(new StuScore("홍길동",100,100,90));
//		list.add(new StuScore("유관순",90,100,90));
//		list.add(new StuScore("이순신",80,90,100));
//		return list;
//	
//	
//	//자동차 3대 리스트
//	ArrayList<Car> carAll() {
//		list2.add(new Car("White",5));
//		list2.add(new Car("Red",4));
//		list2.add(new Car("Black",5));
//		
//		
//		return list2;
//	}//void
	
	
//	void cardAll() {
//		// 1-13 / Spade,Heart,Diamond,Clover 52장의 카드를 생성하시오.
//		for(int i=0;i<card.length;i++) {
//			int number = i%13+1; //1-13
//			String kind = shape[i/13];
//			card[i] = new Card(number,kind);
//		}//for
//	}//void
	
	//카드 1장
//	Card cardInsert() {
//		cardAll(); //52장 카드 생성
//		Card c = new Card();
//		c.setNumber(1);
//		c.setKind("Spade");
//		return c;
	
	//카드 52장
	Card[] cardInsert() {
		cardAll(); //52장 카드 생성
		Card c = new Card();
		c.setNumber(1);
		c.setKind("Spade");
		return card;
		
	}//cardInsert




private void cardAll() {
	// TODO Auto-generated method stub
	
}
	
}
