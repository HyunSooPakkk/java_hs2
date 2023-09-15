package p0914;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	Buyer(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	String id = "aaa";
	String name = "Hong";
	int money = 10000000;
	int bonusPoint = 0;
	//Product[] cart = new Product[10];
	
	//컬렉션 선언
	ArrayList list = new ArrayList(); //Collections Framework★★ 
	
	
	//모든 종류의 상품(Tv, Computer, Audio)을 구매했을 때 사용하는 메소드
	//int i = 0;
	int buy(Product p) {
		//상품 금액이 현재 잔액보다 큰 경우
		if(money<p.price) {
			System.out.println("※알림※ 잔액이 부족하여 구매 불가합니다.");
			System.out.println();
			return 0; //구매 실패
		}//if
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		return 1; //구매 성공
//		cart[i] = p; //p를 Product[] 배열에 담음.
//		i++;
		
	}
	
}
