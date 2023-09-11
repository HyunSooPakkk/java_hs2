package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//5개의 숫자를 입력받아 사칙연산을 각각 출력하시오.
		
		int result = 0;
		int[] n = new int[5];
		//아래를 for문으로 바꾼 것
			for(int i=0;i<n.length;i++) {
				System.out.println((i+1)+"번째 숫자를 입력하세요.");
				n[i] = scan.nextInt();
			}
		
		//5개 수 입력
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = scan.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int c = scan.nextInt();
		System.out.println("네 번째 숫자를 입력하세요.");
		int d = scan.nextInt();
		System.out.println("다섯 번째 숫자를 입력하세요.");
		int e = scan.nextInt();
		
		System.out.print("더하기 결과값: ");
		//result = J0911_05.add(a, b, c, d, e); //같은 클래스 내에 선언되어 있으면 클래스명 생략 가능
		System.out.println(result);
		result = add(n);
		
		System.out.print("빼기 결과값: ");
		//result = J0911_05.sub(a, b, c, d, e);
		System.out.println(result);
		result = sub(n);
		
		System.out.print("곱하기 결과값: ");
		//result = J0911_05.mul(a, b, c, d, e);
		System.out.println(result);
		result = mul(n);
		
		System.out.print("나누기 결과값: ");
		//result = J0911_05.div(a, b, c, d, e);
		System.out.println(result);
		result = div(n);
		
		
	}//main
	 
//	static int add(int a, int b, int c, int d, int e) {
//		return a+b+c+d+e;
//	}
	static int add(int[] n) {
	int result = n[0];
    
    for(int i=1;i<n.length;i++) 
    result = result + n[i];
	
    return result;
    }
	
//	static int sub(int a, int b, int c, int d, int e) {
//		return a-b-c-d-e;
//	}
    static int sub(int[] n) {
    int result = n[0];
    
    for(int i=1;i<n.length;i++) 
    result = result - n[i];
	
    return result;
    }

//	static int mul(int a, int b, int c, int d, int e) {
//		return a*b*c*d*e;
//	}
    static int mul(int[] n) {
        int result = n[0];
        
        for(int i=1;i<n.length;i++) 
        result = result * n[i];
    	
        return result;
        }
    
//	static int div(int a, int b, int c, int d, int e) {
//		return a/b/c/d/e;
//	}
        static int div(int[] n) {
            int result = n[0];
            
            for(int i=1;i<n.length;i++) 
            result = result / n[i];
        	
            return result;
            
            
            

	}//main
}//class
