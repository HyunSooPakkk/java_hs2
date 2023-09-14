package p0914;

public class J0914_01 {
	
	public static void main() {
		
		//전체 매개변수 생성자★★
		StuScore s1 = new StuScore(1,"홍길동",100,100,100);
		System.out.println("학생 번호: "+s1.getStuNo());
	
//		//기본생성자를 호출해서 값을 입력하는 방법
//		StuScore s1 = new StuScore();
//		s1.setStuNo(1);
//		s1.setName("홍길동");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);
//		s1.setTotal(s1.getKor()+s1.getEng()+s1.getMath());
//		s1.setAvg(s1.getTotal()/3.0);
		
	}//main

}//class
