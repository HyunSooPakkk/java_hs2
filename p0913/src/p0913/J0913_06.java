package p0913;

public class J0913_06 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		f1.go();    //Car method
		f1.stop();  //Car method
		f1.water(); //FireEngine method
		
		Ambulance a1 = new Ambulance();
		a1.go();	//Car method
		a1.stop();  //Car method
		//a1.siren(); //Ambulance method
		
		//다형성 c1,c2
		Car c1 = new FireEngine();
		c1.go();
		c1.stop();
		//c1.water(); //공간은 있으나 사용할 수 없음.
		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
		//c2.siren();  //자손 메소드여서 사용할 수 없음.
		
		Car c3;   //주소값만 있고 저장 공간은 없음.
		c3 = f1;  //조상 참조변수 = 자손 참조변수
		//c3.water(); -> 공간이 있어도 조상의 참조변수로는 사용할 수 없음.
		
		FireEngine f2;
		f2 = (FireEngine)c3;
		System.out.println("f2: ");
		f2.water();
		
//		a2 = (Ambulance)c3; //c3에는 FireEngine 객체가 담겨있음
//		a2.siren(); //타입이 달라서 컴파일 에러 발생
		
		Ambulance a2;
		FireEngine f3;
			if(c3 instanceof FireEngine) {
				System.out.println("c3는 FireEngine으로 형 변환 가능합니다.");
			f3 = (FireEngine)c3;
			f3.water();
			}
		
			if(c3 instanceof Ambulance) {
				System.out.println("c3는 Ambulance으로 형 변환 가능합니다.");
			a2 = (Ambulance)c3;
			//a2.siren();
			}
			
			Object o1;
			o1 = f1;
			o1 = a1;
			
			
		}//main
	}//class
