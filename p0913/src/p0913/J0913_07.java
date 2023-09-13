package p0913;

public class J0913_07 {

	public static void main(String[] args) {
		
		Buyer b1 = new Buyer();
		System.out.println("현재 잔액: "+b1.money);
		
		Tv t = new Tv();
		System.out.println(t.price);
		b1.buy(t);
		System.out.println("현재 잔액: "+b1.money);
		
		Computer c = new Computer();
		System.out.println(c.price);
		b1.buy(c);
		System.out.println("현재 잔액: "+b1.money);

		Audio a = new Audio();
		System.out.println(a.price);
		b1.buy(a);
		System.out.println("현재 잔액: "+b1.money);
		
	}//main

}//class
