package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {
		
		ColAction col = new ColAction();
		//HashMap으로 list,list2를 포함해서 넘겨받고 함께 출력하시오.
		HashMap<String, Object> map = col.scoreAll();
		
		//list 출력
		ArrayList<StuScore> list = (ArrayList<StuScore>)map.get("list");
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%2.f,%d",
					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}//for
		
		//list2 출력
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		for(int i=0;i<list2.size();i++) {
			Car c = list2.get(i);
			System.out.println(c.getColor()+","+c.getDoor());
		}//for
		
		
//		//카드 1장 출력
//		Card c = col.cardInsert();
//		System.out.println(c.getKind()+","+c.getNumber());
		
		//카드 52장 출력
//		Card[] card = col.cardInsert();
//		
//			for(int i=0;i<card.length;i++) {
//				System.out.println(card[i].getKind()
//				+","+card[i].getNumber());
//			}//for
		
			
		//list를 전달받아 출력
//		ArrayList<StuScore> list = col.scoreAll();
//			
//		for(int i=0;i<list.size();i++) {
//			StuScore s = list.get(i);
//			System.out.printf("%d,%s,%d,%d,%d,%d,%2.f,%d",
//					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
//					s.getTotal(),s.getAvg(),s.getRank());
//		}//for
			
			
		//list2를 전달받아 출력
//		ArrayList<Car> list2 = col.carAll();
//				
//			for(int i=0;i<list2.size();i++) {
//				Car c = list2.get(i);
//				System.out.println(c.getColor()+","+c.getDoor());
//				
//			}//for
		
		
	}//main
}//class
