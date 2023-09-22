package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();
	
	//1. 성적 입력
	void stuInput() {
		while(true) {
			int count = list.size()+1;
			System.out.println("[성적 입력]");
			System.out.println("▼"+count+"번째 학생 이름을 입력하세요.(0>>이전 페이지 이동)");
			String name = scan.next();
				if(name.equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
				}//if
			System.out.println("▼ 국어 성적을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("▼ 영어 성적을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("▼ 수학 성적을 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name,kor,eng,math));
			System.out.println("학생 성적이 저장되었습니다.");
			System.out.println();
			}//while
	}//stuInput
	
	//2. 성적 출력
	void stuOutput() {
		System.out.println("[성적 출력]");
		System.out.println("--------------------");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t평균\t등수\t");
		
			for(int i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\t \n",
						st.getStuNum(),st.getName(),
						st.getKor(),st.getEng(),st.getMath(),
						st.getTotal(), st.getAvg(),st.getRank());
			}//for
		System.out.println();
	}//stuOutput
	
	//3. 성적 수정
	
	void stuUpdate() {
		while(true) {
			System.out.println("[성적 수정]");
			System.out.println("성적 수정을 원하는 학생 이름을 입력하세요.(0>>이전 페이지 이동)");
			String inputName = scan.next();
			if(inputName.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}//if
			System.out.println("입력된 이름으로 검색중.....");
				//list안에 이름이 모두 있는 상태
				int i = 0; //검색되었을 때 위치점을 저장하는 변수
				int count = 0; //찾는 학생이 있는지 확인하는 변수
				for(i=0;i<list.size();i++) {
					StuScore st = list.get(i);
						if(inputName.equals(st.getName())) {
							System.out.println("입력된 이름으로 학생이 검색되었습니다.");
							count = 1;
							break; //for break
						}//if
				}//for
				if(count==0) { //검색된 이름이 없으면 실행되는 내용
					System.out.println("학생이 검색되지 않습니다. 다시 입력하세요.");
					continue; //switch continue
				}//if
				
			System.out.println("--------------------");
			System.out.println("1.국어 점수");				
			System.out.println("2.영어 점수");				
			System.out.println("3.수학 점수");
			System.out.println("--------------------");
			System.out.println("성적 수정을 원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			
			switch(choice) {
		case 1:
			System.out.println("[국어 점수 수정]");
			System.out.println("--------------------");
			System.out.println("[●현재 국어 점수●]"+list.get(i).getKor());
			System.out.println("변경할 국어 점수를 입력하세요.");
			list.get(i).setKor(scan.nextInt());
			list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()
					+list.get(i).getMath());
			list.get(i).setAvg(list.get(i).getTotal()/3.0);
			System.out.println("--------------------");
			System.out.println(list.get(i).getKor()+"점으로 국어 점수가 수정되었습니다.");
			System.out.println();
			break;
		case 2:
			System.out.println("[영어 점수 수정]");
			System.out.println("--------------------");
			System.out.println("[●현재 영어 점수●]"+list.get(i).getEng());System.out.println("변경할 국어 점수를 입력하세요.");
			System.out.println("변경할 영어 점수를 입력하세요.");
			list.get(i).setEng(scan.nextInt());
			list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()
					+list.get(i).getMath());
			list.get(i).setAvg(list.get(i).getTotal()/3.0);
			System.out.println("--------------------");
			System.out.println(list.get(i).getEng()+"점으로 영어 점수가 수정되었습니다.");
			System.out.println();
		break;
		case 3:
			System.out.println("[수학 점수 수정]");
			System.out.println("--------------------");
			System.out.println("[●현재 수학 점수●]"+list.get(i).getMath());
			System.out.println("변경할 수학 점수를 입력하세요.");
			list.get(i).setMath(scan.nextInt());
			list.get(i).setTotal(list.get(i).getKor()+list.get(i).getEng()
					+list.get(i).getMath());
			list.get(i).setAvg(list.get(i).getTotal()/3.0);
			System.out.println("--------------------");
			System.out.println(list.get(i).getMath()+"점으로 수학 점수가 수정되었습니다.");
			System.out.println();
		break;
			}//switch
		}//while
	}//stuUpdate
	
	
	//4. 성적 삭제
	
	
	//5. 이름 순 정렬
	void stuNameSort() {
		Collections.sort(list,new Comparator<StuScore>() {

			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}//compare
		}); //Collections
		System.out.println("이름 순으로 정렬이 완료되었습니다.");
	}//stuNameSort
	
	
	//6. 성적 낮은 순 정렬
			void stuTotalLowSort() {
				Collections.sort(list,new Comparator<StuScore>() {

					@Override
					public int compare(StuScore s1, StuScore s2) {
						return s2.getTotal()-s1.getTotal();
					}//compare
				}); //Collections
				System.out.println("성적이 낮은 순으로 정렬이 완료되었습니다.");
			}//stuTotalSort
	
	
	
	//7. 성적 높은 순 정렬
		void stuTotalHighSort() {
			Collections.sort(list,new Comparator<StuScore>() {

				@Override
				public int compare(StuScore s1, StuScore s2) {
					return s1.getTotal()-s2.getTotal();
				}//compare
			}); //Collections
			System.out.println("성적이 높은 순으로 정렬이 완료되었습니다.");
		}//stuTotalSort
	
	
	//8. 파일 가져오기
	void stuFOpen() throws Exception {
		FileReader fr = new FileReader("C:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		String line = br.readLine();
			if(line==null) break;
		String[] data = line.split(","); //각 데이터값을 콤마로 분리
		
		int stuNum = Integer.parseInt(data[0]);
		String name = data[1];
		int kor = Integer.parseInt(data[2]);
		int eng = Integer.parseInt(data[3]);
		int math = Integer.parseInt(data[4]);
		int total = Integer.parseInt(data[5]);
		Double avg = Double.parseDouble(data[6]);
		int rank = Integer.parseInt(data[7]);
		
		list.add(new StuScore(stuNum,name,kor,eng,math,
				total,avg,rank));
		
		}//while
		br.close();
		System.out.println("저장된 파일을 불러왔습니다.");
		System.out.println();
	}//stuFOpen
	
	//9. 파일 저장하기
	void stuFSave() throws Exception {
		FileWriter fw = new FileWriter("C:/aaa/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData = "";	
		for(int i=0;i<list.size();i++) {
				StuScore st = list.get(0);
				String line = String.format("%d,%s,%d,%d,%d,%d,%2.f,%d",
						st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath(),
						st.getTotal(),st.getAvg(),st.getRank());
				strData += line+"\r\n"; // 한 명의 성적을 String으로 변환 후 strData 추가해주는 것
				//System.out.println(line);
			}//for
		
			bw.write(strData);
			bw.close();
			System.out.println("학생 성적을 파일에 저장했습니다.");
	
	}//stuFSave
	
	
	
}//class
