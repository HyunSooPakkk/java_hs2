package p0905;

public class J0905_05 {

	public static void main(String[] args) {
		//구구단 출력해봐용
		for(int i=2;i<=9;i++) {
			System.out.printf("[%d단]\t",i);
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				//System.out.println(i+"*"+j+"="+(i*j));
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}

	}

}
