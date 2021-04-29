package chapter3;

public class Student extends Person{

	public Student() {
		// 자식의 모든 생성자에서 부모의 특정 생성자를 명시하지 않으면 암시적으로 
		// 부모의 기본생성자가 자동으로 호출된다.
		// super();
		System.out.println("Student() called");
	}
}
