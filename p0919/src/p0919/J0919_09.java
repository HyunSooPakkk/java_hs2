package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class J0919_09 {

	public static void main(String[] args) {
		
		//1byte씩 읽어서 출력하는 것
		try {
			InputStream is = new FileInputStream("C:/aaa/1.txt");
			
			int read = 0;
			while((read=is.read())!= -1) {
				System.out.println((char)read);
			}//while
			
//			while(true) {
//				int read = is.read();
//				if(read<0) {
//					break;
//				}
//				System.out.println((char)read);
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try-catch
		
		
		//전체를 다 읽어와서 출력
//		try {
//			byte[] b = new byte[1024];
//			InputStream is = new FileInputStream("C:/aaa/1.txt");
//			
//			is.read(b);	
//			int read = is.read();
//			System.out.println(new String(b));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}//main

}//class
