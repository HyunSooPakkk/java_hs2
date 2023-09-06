package p0906;

public class J0906_01 {

	public static void main(String[] args) {
		int[] num = new int[50]; //0-49
		
		int[] random = new int[6];
		random[0] = (int)(Math.random()*50); //0-49
		random[1] = (int)(Math.random()*50); //0-49
		random[2] = (int)(Math.random()*50); //0-49
		random[3] = (int)(Math.random()*50); //0-49
		random[4] = (int)(Math.random()*50); //0-49
		random[5] = (int)(Math.random()*50); //0-49
		
		for(int i=0;i<6;i++) {
			random[i] = (int)(Math.random()*50);
		}
		
		for(int i=0;i<num.length;i++) {    //num.length는 배열의 길이. num[0] ..... num[49]
			num[i] = i+1; //1-49 홀수 출력하고싶을 때는 일차방정식 2n+1 이니까 2*i+1로 바꿔주깅
		}
		
		int n = 0;
		for(int i=0;i<random.length;i++) { //랜덤에 들어가있는 숫자가 6개밖에 없으니까 6번까지만 돌아라~
			n = random[i]; //0-49
			System.out.println("랜덤 뽑기: "+num[n]);
		}
		
		
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
		
	}

}
