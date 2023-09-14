package p0914;

public class Audio extends Product {

		String speakerPower;
		
		Audio(){
			this("Britz스피커7800",200000,2000,"15W");
		}
	
		
		Audio(String pName, int price, int bonusPoint, String speakerPower){
			 this.pName = pName;
			 this.bonusPoint = bonusPoint;
			 this.price = price;
			 this.speakerPower = speakerPower;
		}
}
