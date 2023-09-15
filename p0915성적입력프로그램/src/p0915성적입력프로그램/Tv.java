package p0915성적입력프로그램;

public class Tv extends Product{
	
int size;
	
	Tv(){
		pName = "삼성TV70";
		price = 1000000;
		bonusPoint = 10000;
		size = 70;
		
	}
	@Override // ▶ 너 오버라이딩 된거야 
	public String toString() {
		
		return String.format("%s,%d,%d",pName,price,bonusPoint);
	}
	
	
	
}
