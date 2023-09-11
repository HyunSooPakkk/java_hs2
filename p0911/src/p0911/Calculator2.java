package p0911;

public class Calculator2 {

	//Calculator(){} //기본생성자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);
		Cal2 c2 = new Cal2(10);
		//c2.value = 10; 생략된것임
		System.out.println(c1.value);
		
	}//main

}//class

class Cal1{
	//Cal1(){} //기본생성자
	int value; //인스턴스 변수 - 객체선언 후 참조변수명.변수명
}//Cal1

class Cal2{
	int value; //인스턴스 변수 - 객체선언 후 참조변수명.변수명
	//기본생성자가 안 만들어짐. 생성자가 한개라도 있으면 자바가 만들어주지 않아서 직접 만들어주는 게 좋음.
	Cal2(){} //기본생성자
	Cal2(int x){  //매개변수 1개가 있는 생성자
		value = x;
	}
}
