package kr.co.greenart;

public class ObjectArray {
	public static void main(String[] args) {
//		ExObject[] eo = new ExObject[3];
//		ExObject[0] = new ExObject();
//		ExObject[1] = new ExObject();
//		ExObject[2] = new ExObject();
		
		ExObject[] eo = { new ExObject(), new ExObject(), new ExObject() };
		
		eo[0].num1 = 10;
		eo[1].num1 = 33;
		eo[2].str = "hi";
		
		System.out.println(eo[0].num1);
		System.out.println(eo[1].num1);
		System.out.println(eo[2].str);
		System.out.println(eo[0].str);
		

	}
}

class ExObject {
	int num1;
	int num2;
	String str;
}