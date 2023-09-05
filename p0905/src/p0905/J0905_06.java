package p0905;

public class J0905_06 {

	public static void main(String[] args) {
		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i * j);
			} // for
		} // for

		// 구구단 while문
		int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d*%d=%d\n", i, j, i * j);
				j++;
			}
			i++;
		} // while

//		int i= 10; //초기값은 while문 밑에 넣으면 안 됨. 바깥에 쓰기
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}

		// While문
//		int i=10; //초기값
//		while(i>=0) { //조건식
//			System.out.println(i);
//			i--; //증감식
//		}

		// For문
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}

	}

}
