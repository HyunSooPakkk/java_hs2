package p0918;

public class Tank extends GroundUnit implements Repairable{

	public Tank() {
		super(150); //Tank의 객체선언 시 파워를 150으로 만들어줌.
		hitPoint = MAX_HIT; 
		name = "Tank";
	    }
	
	
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s:[x:%d, y:%d]좌표로 이동\n",name, x,y);
	}
		
}
