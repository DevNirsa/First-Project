package kr.co.greenart;

public class Field {

	public static void main(String[] args) {
//		Person2 p = new Person2();
//		p.defInt = 10;
//		System.out.println(p.defInt);
		Person2.name = "hi";
		System.out.println(Person2.name);
		
//		p.priInt = 10;
	}
}
class Person2{
	int defInt = 0;
	private int priIint = 0;
	
	static String name;
}
