package p0913;

public class Singleton {

	
	private int hour;
	private int min;
	private int sec;
	
	private Singleton() {}
		 
	private static Singleton s = new Singleton();
	
	public static Singleton getInstance() {
		return s;
		}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	
	
}
