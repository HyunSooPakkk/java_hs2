package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		// Lee1, Lee2를 bbb폴더에 복사하시오.

		File f = new File("C:/bbb");
			if(f.exists()) {
				f.mkdir();
			}
		
		FileInputStream fis = new FileInputStream("C:/aaa/Lee1.jpg");	
		FileOutputStream fos = new FileOutputStream("C:/bbb/Lee1.jpg");
		FileInputStream fis1 = new FileInputStream("C:/aaa/Lee2.jpg");	
		FileOutputStream fos2 = new FileOutputStream("C:/bbb/Lee2.jpg");
			
		while(true) {
			int read = fis.read(); //파일 byte 단위로 읽어오기
			if(read==-1) break; //더이상 읽을 파일이 없으면 멈춤
			fos.write(read); //파일을 byte 단위로 저장
		}
		
		fis.close();
		fos.close();
		
		System.out.println("파일이 복사되었습니다.");
		
	}//main

}//class
