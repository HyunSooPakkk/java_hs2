
package p0908;

public class J0908_03객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		
		int a = 0; 
		
		//배열 선언 - 저장할 공간이 생김
		int[] hour = new int[3];
		int[] min= new int[3];
		double[] sec = new double[3];
		
		//배열 데이터 입력
		hour[0] = 12;
		min[0] = 12;
		sec[0] = 12.25;
		
		//객체 선언 - 저장할 공간이 생김
		Time t = new Time();
		t.hour=12;
		t.min=12;
		t.sec=12.25;
		
		Time t2 = new Time();
		Time t3 = new Time();
		
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(t);
		System.out.println(t.hour);
		
		//변수에 데이터 넣기
		int i = 10;
		//배열 선언 후 데이터 넣기
		int[] arr = new int[3];
		arr[0] = 10;
		//객체 선언 후 데이터 넣기
		Time time = new Time();
		time.hour = 10;
		
		
	}

}
