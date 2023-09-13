package p0913;

public class Buyer {
	
	String id = "aaa";
	String name = "Hong";
	int money = 10000000;
	int bonusPoint = 0;
	
	//모든 종류의 상품(Tv, Computer, Audio)을 구매했을 때 사용하는 메소드
	void buy(Product p) {
		money = money-p.price;
		bonusPoint += p.bonusPoint;
	}
}
