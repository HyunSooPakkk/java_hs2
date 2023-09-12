package p0912;

public class Product {
	static int count = 1000; //클래스변수
	int serialNo; //인스턴스변수
	String pName;
	int price;
	
	{ //초기화 블럭(인스턴스): 객체 생성해야만 사용 가능
		count++;
		serialNo = count;
	}
	
	Product(){ //기본생성자
		
	}
	
	Product(String pName){
		this.pName = pName;
	}
	
	Product(String pName, int price){
		
		this.pName = pName;
		this.price = price;
		
		
	}
		
	
}
