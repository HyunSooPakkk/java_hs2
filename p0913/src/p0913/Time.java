package p0913;

public class Time {
 private int hour;
 private int min;
 private int sec;
 
 
 public int getHour() {
	 return hour;
 }
 
 public void setHour(int hour) {
	 if(hour<0 || hour>23) {
		 System.out.println("시가 잘못 입력되었습니다.");
		 return;
	 }
	 
	 this.hour = hour;
 }
 
 public int getMin() {
	 return min;
 }
 
 public void setMin(int min) {
	 if(min<0 || min>59) {
		 System.out.println("분이 잘못 입력되었습니다.");
		 return;
	 }
	 this.min = min;
 }
 
 public int getSec() {
	 return sec;
 }
 
 public void setSec(int sec) {
	 if(sec<0 || sec>59) {
		 System.out.println("초가 잘못 입력되었습니다.");
		 return;
 }
	 this.sec = sec;
 }
 
 
}
