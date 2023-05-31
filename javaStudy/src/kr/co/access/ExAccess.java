package kr.co.access;

import kr.co.deny.ExDeny;

// 클래스는 public 또는 (default)
public class ExAccess{
	public static void main(String[] args) {
		
		System.out.println(ExDeny.width);
		// 컨트롤+쉬프트+O (영어)
//		ExAccess ea = new ExAccess();

//		ea.publicMethod();
//		ea.width = 50;
//		ea.num = 10;
//		System.out.println(ea.toString());
		
//		System.out.println(ExDeny.num);
//		ExDeny.publicMethod();
	}
	
//	@Override
//	protected void publicMethod() {
//		
//	}
	
}
