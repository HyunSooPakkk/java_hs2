package p0913;


public class J0913_05 {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.setHour(10);
		s.setMin(5);
		s.setSec(40);
		System.out.printf("%d시 %d분 %d초",
				s.getHour(),s.getMin(),s.getSec());
		
		System.out.println();
		
		Singleton s2 = Singleton.getInstance();
		s2.setHour(7);
		s2.setMin(21);
		s2.setSec(18);
		System.out.printf("%d시 %d분 %d초",
				s2.getHour(),s2.getMin(),s2.getSec());
		
		
	}

}
