package p0913;

public class J0913_04 {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 13;
//		t.min =7;
//		t.sec = 24;
		t.setHour(13);
		t.setMin(7);
		t.setSec(24);
		System.out.printf("%d시 %d분 %d초 \n",t.getHour(),t.getMin(),t.getSec());
		
		Time t2 = new Time();
//		t.hour = 50;
//		t.min = 55;
//		t.sec = 198;
		t2.setHour(50);
		t2.setMin(55);
		t2.setSec(198);
		System.out.printf("%d시 %d분 %d초 \n",t2.getHour(),t2.getMin(),t2.getSec());
				
	}

}
