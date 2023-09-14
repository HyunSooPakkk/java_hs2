package p0914;

import java.util.ArrayList;

public class J0914_09 {

	public static void main(String[] args) {
		//배열 5개를 "aaa","1111","bbb","2222" 해서 e까지 만들고 출력
		//ArratList 5개 입출력
		 
		Mem m[] = new Mem[5];
		m[0] = new Mem("aaa","1111");
		m[1] = new Mem("bbb","2222");
		m[2] = new Mem("ccc","3333");
		m[3] = new Mem("ddd","4444");
		m[4] = new Mem("eee","5555");
		
		for(int i=0;i<m.length;i++) {
			System.out.printf("[%s,%s]\n",m[i].id,m[i].pw);
			//String타입 변수 2개니까 %s 2개
		}//for
		
		System.out.println("----------");
		ArrayList list = new ArrayList();
		list.add(new Mem("aaa","1111"));
		list.add(new Mem("bbb","2222"));
		list.add(new Mem("ccc","3333"));
		list.add(new Mem("ddd","4444"));
		list.add(new Mem("eee","5555"));
		
		for(int i=0;i<list.size();i++) {
			Mem mm = (Mem)list.get(i);   
			System.out.printf("[%s,%s]\n",mm.id,mm.pw);
			
			}//for
		
	  }//main

}//class
