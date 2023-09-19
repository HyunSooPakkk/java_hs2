package p0919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class J0919_11 {

	public static void main(String[] args) {
		//3.txt 파일을 읽어서 출력하시오.

		
		try {
			FileReader news = new FileReader("C:/aaa/3.txt");
			BufferedReader br = new BufferedReader(news);
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
		
	}//main

}//class
