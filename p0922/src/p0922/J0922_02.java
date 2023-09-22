package p0922;

public class J0922_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enum: 입력값 지정
		Week w = Week.FRIDAY; //객체선언
		String w2 = "FRIDAY";
		
		String weekName = w.name(); //참조변수 w에 들어있는 데이터 이름을 가져옴.
		System.out.println(weekName);
		System.out.println(w.name());
		System.out.println(w2);
		
//		String kind[] = {"Heart","HEART","heart","hEart"};
//			for(int i=0;i<kind.length;i++) {
//				if(kind[i].equals("Heart")) {  
//					System.out.println("♥");
//				}//if 
//			}//for
		
		
	}//main

}//class
