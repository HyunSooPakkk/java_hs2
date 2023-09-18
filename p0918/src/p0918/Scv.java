package p0918;

public class Scv extends GroundUnit implements Repairable{

	Scv() {
		super(40);
		hitPoint = MAX_HIT;
		name = "Scv";
	    }
	
	void repair(Repairable g) {
		if(g instanceof Unit) {
			Unit u = (Unit)g;
			while(u.hitPoint!=u.MAX_HIT) {
				u.hitPoint++;
			}
		}
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}
