package kr.co.greenart;

import java.util.Arrays;

public class Method {
	public static void main(String[] args) {
//		int a = 2;
//		int[] b = {1, 2};
		
//		System.out.println("메소드 호출 전 a값 : "+a);
//		m.exVar(a);
//		System.out.println("메소드 호출 후 a값 : "+a);
//		// 기본 자료형의 경우 원본 변경이 X
//		System.out.println("====================");
//		System.out.println(Arrays.toString(b)); // 컨트롤+쉬프트+O --> import
//		m.exArr(b);
//		System.out.println(Arrays.toString(b));
//		System.out.println("====================");
//		
//		// 위에꺼는 호출스택 배우고 나서
//		
//		String c = "hi";
//		
//		System.out.println("메소드 호출 전 : "+c);
//		m.exStr(c);
//		System.out.println("메소드 호출 후 : "+c);
		
		
		
		
		
		
		Method m = new Method();
		m.numbers("hi", 1, 2, 3, 4, 5, 6, 7);

	}
	
//	public void numbers(int num1, int num2, int num3, int num4) {
	public void numbers(String str, int... numbers) {
		System.out.println(str);			
		for (int number : numbers) { // numbers : 1, 2, 3 향상된 for문 , for-each문
			System.out.println(number);			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String exStr(String c) {
		c = "Hello, World!";
		return c;
	}
	
	public int exVar(int a) {
		a = 100;
		return a;
	}
	
	public int[] exArr(int[] b) {
		b[0] = 1000;
		b[1] = 2000;
		return b;
	}

}
