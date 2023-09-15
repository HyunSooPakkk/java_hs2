package p0915성적입력프로그램;

public class Computer extends Product {
	 String cpu;
	 
	 Computer(){
		 this("LG컴퓨터16",2000000,20000,"i5-1240P");
		 
	 }
	 
	 Computer(String pName, int price, int bonusPoint, String cpu){
		 this.pName = pName;
		 this.bonusPoint = bonusPoint;
		 this.price = price;
		 this.cpu = cpu;
		 
		 
	 }
}
