package p0912;

public class Car {
	String color;
	String gearType;
	int door;

Car(){ //기본생성자
	this("White","auto",5); //다른 생성자 호출시 this() 사용. 항상 문단 상위에 위치.
	color = "white";
	gearType = "auto";
	door = 5;
}

Car(Car c){
	this(c.color, c.gearType, c.door); //this(): 다른 생성자 호출
}

Car(String color, String gearType, int door){
	this.color = color;      //this 붙이지 않으면 지역변수, 
	this.gearType = gearType; //붙이면 인스턴스변수를 가리킨다.
	this.door = door;
}
}

