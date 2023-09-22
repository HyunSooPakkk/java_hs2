package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n1,n2를 JAction cal()로 보내서
		//곱한 결과값을 리턴해서 출력
		
		int n1 = 1000;
		int n2 = 125;
		int a = 1;
		
//		String color = "White";
//		int door = 5;
		
		JAction j = new JAction(); //객체선언
		
		//매개변수 6개를 리턴타입 list로 받음.
		String[] color = {"White","Red","Blue"};
    	int[] door = {5,4,5};
    	String[] name = {"홍길동","유관순","이순신"};
    	int[] kor = {100,90,80};
    	int[] eng = {90,80,70};
    	int[] math = {80,70,60};
    	
    	HashMap<String, Object> map = j.cal(color,door,name,kor,eng,math);
    	
    	ArrayList<Car> list = (ArrayList<Car>) map.get("list");
    	System.out.println("[자동차 색깔,문 갯수]");
    	for(int i=0;i<list.size();i++) {
			Car c = list.get(i);
		System.out.println(c.getColor()+","+c.getDoor());
		}//for
    	System.out.println("--------------------");
    	ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
    	System.out.println("[이름,국어|영어|수학 점수]");
    	for(int i=0;i<list.size();i++) {
    		StuScore s = list2.get(i);
    		System.out.println(s.getName()+","
    		+s.getKor()+"|"+s.getEng()+"|"+s.getMath());
    	}//for
    	
    	
		
//		//매개변수 2개를 리턴타입 list로 받음.
//		String[] color = {"White","Red","Blue"};
//		int[] door = {5,4,5};
//		
//		ArrayList<Car> list = j.cal(color, door);
//		//출력
//			for(int i=0;i<list.size();i++) {
//				Car c = list.get(i);
//			System.out.println(c.getColor()+","+c.getDoor());
//			}//for
		
		
		//매개변수 2개를 리턴타입 객체로 받음.
//		Car c = j.cal(color, door);
//		//c color, door 출력
//		 System.out.println(c.getColor()+","+c.getDoor());
		
		
//		//매개변수 2개를 리턴타입 배열로 받음.
//		int[] result = j.cal(n1, n2);
//			for(int i=0;i<result.length;i++) {
//				System.out.println(result[i]);
//			}//for
		
		
		//매개변수 3개를 리턴타입 int로 받음.
//		int result = j.cal(n1,n2,a); //매개변수로 값을 넘겨줄 수 있음
//		System.out.println("결과값: "+result);
		
		
	}//main	

}//class
