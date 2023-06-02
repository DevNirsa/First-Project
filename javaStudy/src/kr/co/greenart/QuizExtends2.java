package kr.co.greenart;

public class QuizExtends2 {
	public static void main(String[] args) {
//		Dog dog = new Dog();
		Dog dog = new Dog("Buddy", 3);
		
		// return 없이 println 바로 출력
		dog.sleep();
//		dog.bark();
		dog.makeSound();
		
		Cat cat = new Cat("나비", 10);
		cat.makeSound();
		
		// return값을 문자열
//		String str = dog.eat();
//		String str = "Buddy3이(가) 먹는중입니다.";
//		System.out.println(str);
	}
}

class Animal {
	public String name;
	public int age;
	
	// 매개변수 있는 생성자가 이미 있기때문에 컴파일러에서 기본 생성자를 안 만들어줌
	// 그렇기 때문에 개발자가 기본 생성자를 직접 구현 해줘야함
	Animal() {}
	
	// 같은 클래스에 있는 멤버변수에 값을 넣어야 하기 때문에 super가 아닌 this 사용
	// super : 부모 클래스에 접근할때
	// this : 내 클래스에 접근할때
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String eat() {
		return name+age+"이(가) 먹는중입니다."; // 문자열타입으로 반환
	}
	
	public void sleep() {
		System.out.println(name+age+"이(가) 잠을 자고 있습니다.");
	}
	
	public void makeSound() {
		System.out.println("동물들이 소리를 냅니다.");
	}
}

class Dog extends Animal{
	Dog(String name, int age) {
		super(name, age);
//		super.name = name;
//		super.age = age;
	}
	
	@Override
	public void makeSound() {
		System.out.printf("%s, %d 이가 멍멍! 하고 소리를 냅니다. \n",super.name, super.age);
	}
	
//	public void bark() {
//		System.out.println("멍멍!");
//	}
	
}

class Cat extends Animal {
	
	Cat(String name, int age) {
		super(name,age);
//		super.name = name;
//		super.age = age;
	}
	
	@Override
	public void makeSound() {
		System.out.printf("%s, %d 이가 야옹~하고 소리를 냅니다. \n", super.name, super.age);
	}
	
//	public void meow() {
//		System.out.println("야옹~");
//	}
	
}









