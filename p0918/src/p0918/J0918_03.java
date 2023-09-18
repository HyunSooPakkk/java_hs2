package p0918;

public class J0918_03 {

	public static void main(String[] args) {
		
		Tank t = new Tank(); //탱크 1대
		System.out.println("탱크 폭탄 맞음");
		t.hitPoint -= 10;
		System.out.println("탱크 폭탄 맞음");
		t.hitPoint -= 10;
		System.out.println("총알 맞음");
		t.hitPoint -= 2;
		System.out.println("탱크 파워: "+t.hitPoint);
		
		Scv s = new Scv(); //Scv 1
		Marine m = new Marine(); //Marine 1
		DropShip d = new DropShip(); //DropShip 1
		System.out.println("DropShip 총알 맞음");
		d.hitPoint -= 20;
		System.out.println("DropShip 파워: "+d.hitPoint);
		s.repair(t);
		System.out.println("탱크 파워 "+t.hitPoint);
		s.repair(d); 
		System.out.println("Marine 총알 맞음");
		m.hitPoint -= 30;
		System.out.println("Marine 파워: "+m.hitPoint);
	    //s.repair(m);
		
	}//main

}//class
