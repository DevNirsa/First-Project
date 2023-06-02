package kr.co.greenart;

public class Constructor {

	public static void main(String[] args) {
		ExData1 ed1 = new ExData1(); 
//		ExData2 ed2 = new ExData2(10, 20); // 기본생성자로 객체를 생성하면
//		ExData2 ed2 = new ExData2(); // 기본생성자로 객체를 생성하면
//		System.out.println(ed2.num1 + " " + ed2.num2);
		
//		System.out.printf("%s , %d , %d \n", p1.name, p1.price, p1.count);
		

		Product p2 = new Product("마우스", 25000, 5);

		System.out.printf("%s , %d , %d \n", p2.name, p2.price, p2.count);
		
		Product p3 = new Product("키ccccc보드cccccc", 50000);
		System.out.printf("%s , %d , %d ", p3.name, p3.price, p3.count);
		
		Product p1 = new Product();
	}
}

class Product {
	String name;
	int price;
	int count;
	
	// name : 없음
	// price : 0
	// count : 0
	Product(){
		this("없음", 0 ,0);
	};
	
	Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		count = 0;
	}
	
}

class ExData1 {
	
	ExData1() {};
	
	public void method() {
		///
	}
	///
}

class ExData2 {
	int num1; // 0
	int num2;
	
	// int int
	ExData2(int num1, int num2) {
		num1 = num1;
		num2 = num2;
	}
	
	// int
	ExData2(int a) {
		num = a;
	};
	
	// String String
	ExData2(String str1, String str2) {
		
	}
	// String int
	ExData2(String str, int num) {
		
	}
	
	public void varMethod() {
		int local = 0;
		System.out.println(local);
	}
	
}
