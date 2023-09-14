package p0914;

public class Tv extends Product {
	
	int size;
	
	Tv(){
		pName = "삼성TV70";
		price = 1000000;
		bonusPoint = 10000;
		size = 70;
		
	}
	@Override
	public String toString() {
		
		return String.format("%s,%d,%d",pName,price,bonusPoint);
	}
	
}
