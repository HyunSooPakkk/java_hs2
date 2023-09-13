package p0913;

import java.text.SimpleDateFormat;
import java.util.*;

public class J0913_02DateCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = {1,2,3,4,5};
		System.out.println(java.util.Arrays.toString(a));
		int[] b = {1,2,3,4,5};
		System.out.println(Arrays.toString(b));
		java.lang.String str = new String("a");
		
		java.util.Date today = new java.util.Date(); //날짜 포맷 설정: YYYY/MM/DD
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println(sdf.format(today));
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(today));
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf3.format(cal.getTime()));
	}

}
