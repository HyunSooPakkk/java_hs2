package p0915성적입력프로그램;

import java.util.Scanner;

public class J0915_01하이마켓 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[하이마켓 쇼핑몰]");
		String id = "aaa";
		String pw = "1111";
		String name = "홍길동";
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		programLoop: while(true) {
			System.out.println("[하이마켓 가전 카테고리]");
			System.out.println("1.TV");
			System.out.println("2.컴퓨터");
			System.out.println("3.오디오");
			System.out.println("4.세탁기");
			System.out.println("5.현재 잔액 조회");
			System.out.println("8.상품 구매 목록");
			System.out.println("9.금액 충전");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------");
			System.out.println("구매를 원하시는 번호를 입력하세요.");
			choice = scan.nextInt();
			
		switch(choice) {
		
		case 1:
			productBuy("Tv",b1);
		case 2:
			productBuy("컴퓨터",b1);
		case 3:
			productBuy("오디오",b1);
		case 4:
			productBuy("세탁기",b1);
			break;
			
		case 5:
			System.out.println("[잔액 조회]");
			System.out.println("---------------");
			System.out.printf("%s님 현재 잔액: %d원 \n",b1.name,b1.money);
			System.out.println();
			break;
		
		case 8:
			System.out.println("[상품 구매 목록]");
			System.out.println("---------------");
				for(int i=0;i<b1.list.size();i++) {
					Product p = (Product)b1.list.get(i);
					if(i==0) {
						System.out.printf("%s",p.pName);
					}
					System.out.printf(",%s ",p.pName);
				}
			
		case 9:
			System.out.println("[금액 충전]");
			System.out.println("---------------");
			System.out.println("충전하려는 금액을 입력하세요.");
			int coin = scan.nextInt();
			//카드사 연결 URL만 넣으면 됨.
			b1.money += coin;
			System.out.println("--------------------");
			System.out.printf("충전 금액: %,d원",coin);
			System.out.println();
			System.out.printf("충전 후 잔액: %,d원 \n",b1.money);
			System.out.println("--------------------");
			System.out.println();
			break;		
			
		case 0:
			System.out.println("[프로그램 종료]");
			System.out.println("---------------");
			System.out.println("프로그램을 종료합니다.");
			System.out.println();
			break programLoop;		
			
		
			}//switch
			
		}//while
		
	}//main
	
		static void productBuy(String pName,Buyer b1) {
			Scanner scan = new Scanner(System.in);
			System.out.printf("[%s 구매]\n",pName);
			System.out.println("결제를 진행하시겠습니까?(1.예 2.아니오)");
			int choice = scan.nextInt();
			if(choice==0) {
				int check = 0;
			if(pName.equals("TV")) 
				check = b1.buy(new Tv());
			else if(pName.equals("컴퓨터"))	
				check = b1.buy(new Computer());
			else if(pName.equals("오디오"))	
				check = b1.buy(new Audio());
			else if(pName.equals("세탁기"))	
				check = b1.buy(new Wash());
			
			if(check==0) return;
				System.out.printf("%s를 구매하셨습니다.",pName);
				System.out.printf("구매 후 잔액: %d원 \n",b1.money);
				System.out.println();
			} else {
				System.out.printf("%s 구매를 취소하셨습니다.",pName);
				System.out.println();
			}//if
				
		}//void
			
}//class
