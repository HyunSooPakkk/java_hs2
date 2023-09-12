package p0912;

public class Child extends Parent{

	 int x = 100; //인스턴스 변수
	 int y = 20;
	 void method(int x) { //인스턴스 메소드
		 
		 System.out.println("x: "+x);
		 System.out.println("this.x: "+this.x);
		 System.out.println("super.x: "+super.x);
	 
	 }
}
