package p0919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J0919_10 {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			FileReader fr = new FileReader("C:/aaa/2.txt");
			br = new BufferedReader(fr);
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
