package p0921;

public class J0921_01 {

	public static void main(String[] args) {
		
		//
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;

		int m1=0, m2=0, m3=0;
		m1 = Math.min(Math.min(m2, m3), no3);
		m3 = Math.min(Math.min(m2, m3), no3);
		m2 = (no1+no2+no3)-m1-m3; //5+15+2-2-15 =5
		System.out.println(Math.max(Math.max(no1, no2), no3));
		System.out.println(Math.max(Math.max(no1, no2), no3));
		
		System.out.printf("%d,%d,%d \n",m1,m2,m3);
		
		
	}//main

}//class
