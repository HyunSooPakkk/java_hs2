package p0922;

public class Car {
 
Car(){}
	
	
	public Car(String color, int door) {
		this.Color = color;
		this.door = door;
	}


	private String Color;
	private int door;
	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public int getDoor() {
		return door;
	}


	public void setDoor(int door) {
		this.door = door;
	}
	
	
	
}
