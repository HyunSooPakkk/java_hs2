package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_04 {

	public static void main(String[] args) {
		
		File f = new File("C:/Download/aaa.txt");
		if(!f.exists()) {
			try {
				f.createNewFile(); //하드에 저장
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//if
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요, 반갑습니다.\r\n두번째 줄입니다.\r\n");
			writer.close();
		
		} catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("파일이 생성되었습니다.");
		
	}//main

}//class
