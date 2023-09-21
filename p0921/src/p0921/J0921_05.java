package p0921;

import java.util.ArrayList;

public class J0921_05 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Card(1,"Spade"));     //list.add(Object O)
		list.add(new Card(2,"Heart"));
		list.add(new Card(3,"Diamond"));
		list.add(new Card(4,"Clover"));
		//list.add(new StuScore()); 입력불가
		
		
		//list 출력
			for(int i=0;i<list.size();i++) {
				Card c = (Card)list.get(i);
				System.out.println(c.getNumber()+","+c.getKind());
			}
		
	   //Card에 toString 넣기
				
				
				
				
		
//		ArrayList list = new ArrayList(); //single-thread 지원
//		//Vector list2 = new Vector(); //multi-thread 지원
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		//Set에는 4개, List에는 6개 값이 들어감.
//		
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(i));
//			}
		
		
		
	}//main

}//class
