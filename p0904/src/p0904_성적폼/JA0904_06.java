package p0904_성적폼;

public class JA0904_06 {

	public static void main(String[] args) {
		double temp = Math.random();  //round()반올림,ceil()올림,floor()버림
		int num = (int)(Math.random()*10)+1;
	
		System.out.println("난수값: "+temp);
		System.out.println("랜덤 정수값: "+num);
		
		//1부터 100까지의 랜덤 정수값을 구하려면 어떻게 해야 할까?
		int num2 = (int)(Math.random()*100)+1;
		//0부터 9까지의 랜덤 정수값은?
		int num3 = (int)(Math.random()*10)+1;
		//1부터 50까지의 랜덤 정수값은?
		int num4 = (int)(Math.random()*50)+1;
		//1부터 45까지의 랜덤 정수값은?
		int num5 = (int)(Math.random()*45)+1;
		//0부터 9999까지의 랜덤 정수값은?
		int num6 = (int)(Math.random()*10000);
		//1부터 20까지의 랜덤 정수값은?
		int num7 = (int)(Math.random()*20)+1;
		
		

	}//main

}//class
