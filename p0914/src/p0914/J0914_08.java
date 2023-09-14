package p0914;

import java.util.ArrayList;

public class J0914_08 {

	public static void main(String[] args) {
		//배열 ▶ 크기 제한, 같은 타입만 가능, 삭제 불가, 부분삽입 불가
		Card[] c = new Card[4];
		
		c[0] = new Card("Spade",1);
		c[1] = new Card("Heart",1);
		c[2] = new Card("Diamond",1);
		c[3] = new Card("Clover",1);

		for(int i=0;i<c.length;i++) {
			System.out.printf("[%s,%d]\n",c[i].kind,c[i].number);
		}
		
		System.out.println("----------------------------------------");
		//위 배열과 동일한 것
		//컬렉션 프레임워크 ▶ 크기 제한 없음, 모든 타입 가능, 삭제 가능, 부분삽입 가능
		ArrayList list = new ArrayList();
		list.add(new Card("Spade",1)); //Object로 형 변환됨.
		list.add(new Card("Heart",1));
		list.add(new Card("Diamond",1));
		list.add(new Card("Clover",1));
		
		for(int i=0;i<list.size();i++) {
		Card ca = (Card)list.get(i);
		System.out.printf("[%s,%d]\n",ca.kind,ca.number);
		
		}//for
		
		
		
		
		
	}//main

}//class
