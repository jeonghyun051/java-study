package chapter3;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("둘리");
		student.setGrade(4);
		student.setMajor("CS");

		Person p1 = student; // upcasting (암시적)
		Student s2 = (Student) p1; // downcasting(명시적)
	}

}
