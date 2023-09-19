package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08 {

	public static void main(String[] args) throws Exception{
		//파일을 한 개 생성 - File 객체는 폴더, 파일을 생성할 수 있음.
		//폴더 생성
		File f = new File("C:/bbb");
		f.mkdir();
		System.out.println("폴더가 생성되었습니다.");
		File fFile = new File("C:/bbb/1.txt");
		fFile.createNewFile();
		
	}//main

}//class
