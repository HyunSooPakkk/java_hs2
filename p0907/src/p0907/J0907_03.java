package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int[] score = new int[5]; // 값: 0,0,0,0,0
		
		// score = num; 얕은 복사 또는 주소값 복사. 이렇게 복사하면 안 됨!
		// 올바른 배열 복사 방법 ① for문. 데이터값 전체를 다른 장소에 복사.
		for(int i=0;i<num.length;i++) {
			score[i] = num[i];
		}
		
		// 올바른 배열 복사 방법 ② System.arraycopy 메소드. 데이터값 전체를 다른 장소에 복사.
		// 1)원본배열 2)위치 3)복사대상배열 4)위치 5)복사개수
		System.arraycopy(num,1,score,2,2);
		//num[0] = 20;         //얘는 안 쓰니까 외우지 마세요~
		
		System.out.println(Arrays.toString(score));

	}

}
