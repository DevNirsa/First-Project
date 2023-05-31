package kr.co.greenart;

public class QuizExtends1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.study();
		s.studentId = "23052412";
		s.studentInfo();
		
		s.name = "김재섭";
		s.displayInfo();
	}
}


class Person3 {
	String name;
	int age;
	
	public void displayInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
}

class Student extends Person3 {
	String studentId;
	
	@Override
	public void displayInfo() {
		System.out.printf("이름 : %s , 나이 : %d , 학번 : %s", super.name, super.age, studentId);
	}
	
	public void study() {
		System.out.println("공부를 시작합니다.");
	}
	
	public void studentInfo() {
		System.out.println(studentId);
	}
	
}