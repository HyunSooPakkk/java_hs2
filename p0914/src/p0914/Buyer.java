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
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
//		cart[i] = p; //p를 Product[] 배열에 담음.
//		i++;
		
	}
	
}
