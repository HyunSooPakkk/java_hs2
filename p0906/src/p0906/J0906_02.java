package p0906;

public class J0906_02 {

	public static void main(String[] args) {
		//배열 100개를 생성하고, 1-100까지 숫자를 입출력하시오.
		
		int[] arrNum = new int[100];
		for(int i=0;i<100;i++) {
			arrNum[i] = i+1;
		}
		
		for(int i=0;i<arrNum.length;i++) {
			if(i==0) {
				System.out.print(arrNum[i]);
			} else {
				System.out.print(","+arrNum[i]);
			
			System.out.println("입력한 숫자: "+arrNum[i]);
		}
		}//for
		
		System.out.println();

	}//main

}//class
