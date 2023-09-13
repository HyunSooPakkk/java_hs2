package p0913;



public class J0913_03 {

	public static void main(String[] args) {
		Card_Test c1 = new Card_Test();
		c1.kind = "Spade";
		c1.number = 1;
//		c1.flag = 1; //Card_test에 선언되어있는 private int 참조. private 제어자는 같은 클래스에서만 사용가능. 
		System.out.printf("%s,%d",c1.kind,c1.number);
		System.out.println();
//		System.out.printf("%s,%d, %d",c1.kind,c1.number,c1.flag);

		//CCard c2 = new CCard();
		
		
		
	}

}
