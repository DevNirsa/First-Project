package kr.co.greenart;

public class Extends {

	public static void main(String[] args) {
		Child c = new Child();
		c.num = 50;
		System.out.println(c.num);
		System.out.println(c.getParentNum());
		System.out.println(c.getChildNum());
		
	}
}


class Parent {
	int num;
	
	Parent() {
		System.out.println("부모 클래스 기본 생성자 입니다.");
	}
	
	Parent(int a, int b, int c) {
		System.out.println("부모 클래스 매개변수 있는 생성자 입니다.");		
	}
	
	public void parentMethod() {
		System.out.println("나는 부모입니다.");
	}
}

class Child extends Parent {
	int num = 0;
	
	Child(){
//		num = 20;
//		System.out.println(this.num);
//		System.out.println(super.num);
//		super(1, 2, 3);
	}
	
	public int getParentNum() {
		return super.num;
	}
	public int getChildNum() {
		return this.num;
	}
	
	Child(int num) {
		this.num = num;
	}
	
	public void childMethod() {
		System.out.println("나는 자식입니다.");
	}
}