package p0911;

import java.util.Scanner;

public class J0911_10 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번째 숫자: ");
		c.num1 = scan.nextInt();
		System.out.println("2번째 숫자: ");
		c.num2 = scan.nextInt();
		calculate(c);
		System.out.println("더하기 결과값: "+c.addResult);
		System.out.println("빼기 결과값: "+c.subResult);
		System.out.println("곱하기 결과값: "+c.multiResult);
		System.out.println("나누기 결과값: "+c.divResult);

	}//main

	static void calculate(Calculator c) { 
		c.addResult = c.num1 + c.num2;
		c.subResult = c.num1 - c.num2;
		c.multiResult = c.num1 * c.num2;
		c.divResult = c.num1 / c.num2; //소수점 넣으려면 (double)c.num2; 하면 됨
		
	}
	
}//class
