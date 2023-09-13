package p0913;

public class Card_Test {
	Card_Test(){}
	Card_Test(String kind, int number){
		this.kind = kind;
		this.number = number;
		
	}//main
	
	String kind;
	int number;
	private int flag;
	String cardShape[] = {"0","1","2","3","4","5","6","7","8","9","10",
			"J","Q","K"};
			
			public String toString() {
		return String.format("[%s,%s]\n",kind, cardShape[number]);
			
			
	}//toString
	
}//class
