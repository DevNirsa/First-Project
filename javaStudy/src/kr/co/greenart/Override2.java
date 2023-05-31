package kr.co.greenart;

public class Override2 {

	public static void main(String[] args) {
//		ParentOver po = new ParentOver();
//		ChildOver2 co2 = new ChildOver2();
		ChildOver co = new ChildOver();
//		String str = co.exOver();
		int sum = co.intOver(5, 7);
		System.out.println(sum);
		
		System.out.println(co.toString());
	}

}

class ParentOver {
	public String exOver() {
		return "저는 부모 클래스 메소드 입니다.";
	}
	
	public int intOver(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}

class ChildOver extends ParentOver {
	
	@Override
	public String exOver() {
		return "오버라이딩된 메소드 입니다.";
	}
	
	@Override
	public int intOver(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
//	public int intOver(int num, float fNum) {
//		
//	}
//	
//	public int intOver(float fNum, int num) {
//		
//	}
}
	
//	public String test() {
//		// 구현부
//	} ;

//class ChildOver2 extends ChildOver {
//	public String exOver() {
//		return "후손 클래스에서 오버라이딩한 메소드 입니다.";
//	}
//}
















