package p0919;

public class KorPerson {

	KorPerson(){}
	KorPerson(String JuminNo, String name){
	this.JuminNo = JuminNo;
	this.name = name;
	}
	String JuminNo;
	String name; 
	
	@Override
	public boolean equals(Object obj) {
		boolean temp = false;
		KorPerson k = (KorPerson)obj;
		if(JuminNo.equals(k.JuminNo)) {
			temp = true;
		} 
		
		return temp;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s]",JuminNo,name);
	}
}
