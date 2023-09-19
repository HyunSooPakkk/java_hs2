package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_05 {

	public static void main(String[] args) {
		
			try {
				System.out.println(0/0);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("예외가 발생되어도, 발생되지 않아도 무조건 실행됨.");
				
		  }//try-catch
		

	}//main

}//class
