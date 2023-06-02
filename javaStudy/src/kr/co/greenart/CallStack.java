package kr.co.greenart;

import java.util.Arrays;

public class CallStack {
	int num;
	int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8};

	public static void main(String[] args) {
		CallStack cs = new CallStack(); // 객체 생성 - 인스턴스화
		System.out.println(cs.num);
//		cs.num = 10;
//		System.out.println("메소드 호출 전 : " + cs.num);
//		cs.change(cs.num);
//		System.out.println("메소드 호출 후 : " + cs.num);
		
		System.out.println("메소드 호출 전 : " + Arrays.toString(cs.numArr)); // 1, 2, 3
		cs.changeArr(cs.numArr);
		System.out.println("메소드 호출 후 : " + Arrays.toString(cs.numArr)); // 1, 2, 5000
	}
	
	public void changeArr(int[] numArr) {
		numArr[2] = 1000;
		System.out.println("메소드 호출 : " + Arrays.toString(numArr)); // 1, 2, 5000
	}
	
	
	
	public void change(int num) { // 매개변수가 기본형 int
		num = 1000;
		System.out.println("메소드 호출 : " + num);
	}
	

}
