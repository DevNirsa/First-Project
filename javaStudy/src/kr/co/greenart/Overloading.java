package kr.co.greenart;

public class Overloading {
	public static void main(String[] args) {
//		Overloading obj = new Overloading();
		exOverloading(1);
//		obj.exOverloading(2, true);
//		obj.exOverloading(false, 3);
	}
	
	public static void exOverloading(int num) {
		System.out.printf("예시1번, 받은 매개변수 1. %d \n", num);
	}
	
//	public void exOverloading(int num, boolean isTrue) {
//		System.out.printf("예시2번, 받은 매개변수 1. %d : , 2. %b \n", num, isTrue);
//	}
//	
//	public void exOverloading(boolean isTrue, int num) {
//		System.out.printf("예시3번, 받은 매개변수 1. %b : , 2. %d \n", isTrue, num);
//	}

}
