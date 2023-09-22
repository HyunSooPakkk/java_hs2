package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class JAction {

	ArrayList<Car> list = new ArrayList();
	ArrayList<StuScore> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	//리턴타입: Map 컬렉션 프레임워크
	HashMap<String, Object> cal(String[] color,int[] door,
			String[] name, int[] kor, int[] eng, int[] math) {
		list.add(new Car(color[0],door[0]));
		list.add(new Car(color[1],door[1]));
		list.add(new Car(color[2],door[2]));
		
		list2.add(new StuScore(name[0],kor[0],eng[0],math[0]));
		list2.add(new StuScore(name[1],kor[1],eng[1],math[1]));
		list2.add(new StuScore(name[2],kor[2],eng[2],math[2]));
		
		
		map.put("list", list);
		map.put("list2", list2);
		return map;
	}//void
	
	
//	//리턴타입: list 컬렉션 프레임워크
//	ArrayList<Car> cal(String[] color,int[] door) {
//			list.add(new Car(color[0],door[0]));
//			list.add(new Car(color[1],door[1]));
//			list.add(new Car(color[2],door[2]));
//			
//			return list;
//		}//void
	
	
//	//리턴타입: 객체
//	Car cal(String color,int door) {
//		Car c = new Car(color, door);
//		return c;
//	}//void
	
//	//리턴타입: 배열
//	int[] cal(int n1,int n2) {
//		
//		int[] result = new int[4];
//		result[0] = n1+n2;
//		result[1] = n1-n2;
//		result[2] = n1*n2;
//		result[3] = n1/n2;
//		//return은 1개만 가능하다.
//		return result;
//	}//void
	
	
//	//리턴타입: int
//	int cal(int n1,int n2, int a) {
//		int result = n1*n2;
//		return result;
//	}//void
	
}//class
