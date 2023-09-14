package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		
		Car c;
		FireEngine f1 = new FireEngine();
		System.out.println("[f1기능]");
		f1.water();
		f1.go();
		f1.stop();
		c = f1; //car 형 변환 생략 가능
		System.out.println("[c기능]");
		c.go();
		c.stop();
		//c.water(); //사용불가 ▶ c에는 water라는 공간은 있지만 c참조변수는 water를 사용할 수 없음.

		Ambulance a1 = new Ambulance();
		c = a1; //Ambulance Car 형 변환
		
		FireEngine f2; //주소값만 있음. 여기에 c를 가져올것임.
		Ambulance a2;
		//a2(Ambulance)c; //프로그램상에는 문제가 없는데 실행해보면 에러나는 경우. c안에 FireEngine이 있어서
			if(c instanceof FireEngine) {
				System.out.println("[f2기능]");
				f2 = (FireEngine)c;
				f2.water();
				f2.go();
				f2.stop();
			}
			if(c instanceof Ambulance) {
				System.out.println("[a2기능]");
				
			}
		f2 = (FireEngine)c; //FireEngine 형 변환 생략 불가. 무조건 붙여줘야 함.
		f2.water();
		f2.go();
		f2.stop();
		
		
	}

}
