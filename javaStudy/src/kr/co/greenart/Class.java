package kr.co.greenart;


public class Class {
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println(p);
		System.out.println(System.identityHashCode(p));
	}
}

class Person {  // 사람이라는 설계도(틀)
	public String walk() {  // 특정한 기능이나 동작(행위)
		return "한걸음 걸었어요aa.";
	}
	
	public String run() {
		return "뛰고 있어요.";
	}
	
	public String stop() {
		return "멈췄어요.";
	}
}
