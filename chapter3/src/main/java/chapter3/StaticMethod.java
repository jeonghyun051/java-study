package chapter3;

public class StaticMethod {
	int n;

	static int m;

	void f1() {
		System.out.println(n);
	}

	void f2() {
		System.out.println(StaticMethod.m);

		// 같은 클래스의 클래스 변수 접근에서는 생략이 가능하다.
		System.out.println(m);
	}

	void f3() {
		f2();
	}

	void f4() {

		// 같은 클래스의 클래스 변수 접근에서는 생략이 가능하다.
		StaticMethod.s1();
	}

	static void s1() {
		// 오류 : static method에서는 인스턴스 변수에 접근할 수 없다.
		// System.out.println(n);
	}

	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스의 클래스 변수 접근에서는 클래스 이름 생략이 가능하다.

		System.out.println(m);
	}

	static void s3() {
		// 오류 : static method에서는 인스턴스 메소드에 접근 할 수 없다.
		// f1();
	}

	static void s4() {
		// 같은 클래스의 클래스 변수 메소드 접근에서는 클래스 이름 생략이 가능하다.
		StaticMethod.s1();

	}
}