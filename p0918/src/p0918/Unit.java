package p0918;

public abstract class Unit {

	int x, y;
	String name;
	int hitPoint;
	final int MAX_HIT;
	
	Unit(int hp){
		MAX_HIT = hp;
	}
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지합니다.");
	}
	
}
