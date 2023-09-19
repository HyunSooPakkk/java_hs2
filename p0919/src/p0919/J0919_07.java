package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {

	//메인 메소드
	public static void main(String[] args) {
		String aName = "C:/aaa/1.txt";
		File f = createFile(""); //createFile 메소드 호출

	}//main

	//createFile 메소드
	static File createFile(String fileName) {
		try {
		if(fileName==null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다.");
		}
	} catch (Exception e) {
		fileName = "C:/aaa/제목없음.txt";
		e.getMessage();
	} finally {
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fileName+"파일이 생성되었습니다.");
		return f;
	}
	}//createFile
	
}//class
