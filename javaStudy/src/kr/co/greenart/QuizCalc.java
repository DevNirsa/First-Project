package kr.co.greenart;

import java.util.Scanner;

public class QuizCalc { 
	public static void main(String[] args) {
		Calc c = new Calc();
		
		c.instanceNumFirst = 10; // 인스턴스 변수
		c.instanceNumSecond = 25;// 인스턴스 변수
		int sum = c.instanceNumFirst + c.instanceNumSecond;
		System.out.println(sum);
		
		c.instanceNumFirst = 20; // 인스턴스 변수
		Calc.classNumThird = 30; // 클래스 변수
		System.out.println(c.instanceNumFirst + Calc.classNumThird);
							// 20             +     35
		
		Calc c2 = new Calc();
		System.out.println(c2.instanceNumFirst);
	}
}

class Calc{
	// 인스턴스 변수
	int instanceNumFirst;  // 10
	int instanceNumSecond; // 25
	
	// 클래스 변수
	static int classNumThird; // 35
	
}
