package p0921;

import java.util.ArrayList;

public class J0921_06 {

	public static void main(String[] args) {
		//ArrayList
		//White,5  Red,4  Black,5  Gray,5  Blue,4
		//Car 객체 5개를 리스트에 추가해서 출력하시오.

		ArrayList<Car> list = new ArrayList();
		
		
		list.add(new Car("white",5));
		list.add(new Car("Red",4));
		list.add(new Car("Black",5));
		list.add(new Car("Gray",5));
		list.add(new Car("Blue",4));
		
			for(int i=0;i<list.size();i++) {
				Car c = list.get(i);
				System.out.println(c.getColor()+","+c.getDoor());
			}//for
		
		
		
	}//main

}//class
