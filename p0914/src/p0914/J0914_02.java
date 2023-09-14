package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd hh시 mm분 ss초");
		System.out.println(sdf2.format(d));
		
		//일반 객체선언은 에러나서 아래처럼 해야함
		Calendar cal = Calendar.getInstance(); //클래스명.메소드명 >클래스메소드를 호출하는 것.
		//cal은 딱 하나(모든 사람이 공통 사용하는 Singleton 패턴)
		System.out.println(sdf.format(cal.getTime()));
		

	}

}
