package p0918;

public class DropShip extends Unit implements Repairable{

	public DropShip() {
		super(120);
		hitPoint = MAX_HIT;
		name = "DropShip";
	    }
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s:[x:%d, y:%d]좌표로 이동\n",name, x,y);

	}

}
