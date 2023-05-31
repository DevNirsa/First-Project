package kr.co.greenart;
import java.util.Scanner;

import java.util.Random;

public class Operater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		do {
			System.out.print("문자를 입력해주세요: ");
			userInput = scanner.nextLine();			
		} while(!userInput.equals("exit"));
		
		System.out.print("종료합니다.");
		
//		String userInput = "";
//		while(!userInput.equals("exit")) {
//			System.out.print("문자를 입력해주세요: ");
//			userInput = scanner.nextLine();
//		}
		
		
		
		
		
		
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
//		Random random = new Random();
//		
//		for(int i=0; i<6; i++) {
//			int lottoNumber = random.nextInt(45)+ 1;
//			System.out.print(lottoNumber+" ");			
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반복할 횟수를 입력하세요 : ");
//		int num = sc.nextInt();
//		//            6<=5
//		for(int i=0; i<=num; i++) {
//			System.out.println("현재 반복 횟수는? : "+i);
//			System.out.println("num의 값은? : "+num);
//			System.out.println("i <= num : "+(i<=num));
//		}
		
		
		
		
		
//		switch(num) {
//			case 1 :
//				break;
//			case 2 :
//				System.out.println("1또는 2를 입력하셨습니다.");
////				System.out.println("2");
//				break;
//			default :
//				System.out.println("해당하는 메뉴가 없음");		
//		}
		
//		if(num == 3 || num == 4 || num == 5) {
//			System.out.println("봄입니다.");
//			if(num == 3) {
//				System.out.println("3월 입니다.");				
//			} else if(num == 4) {
//				System.out.println("4월 입니다.");								
//			} else if(num == 5) {
//				System.out.println("5월 입니다.");												
//			}
//		} else if(num >= 6 && num <= 8) {
//			System.out.println("여름입니다.");			
//		} else if(num >= 9 && num <= 11) {
//			System.out.println("가을입니다.");			
//		} else if(num == 12 || num == 1 || num == 2) {
//			System.out.println("겨울입니다.");			
//		} else {
//			System.out.println("해당하는 계절이 없습니다.");						
//		}
		
		
		
		
		
		  // 1:true && (1:false || 1:true)  
		  // 1:true && (true)
		  // true
//		if(num == 1 && (num >= 4 || num == 1)) {
//		if(num == 1) {
//			System.out.println("입력된 숫자는 1입니다");
//		} else if(num > 2 && num < 5) {
//			System.out.println("입력된 숫자는 2보다 크고, 5보다 작습니다.");
//		} else {
//			System.out.println("모두 거짓입니다.");
//		}
		

	}

}
