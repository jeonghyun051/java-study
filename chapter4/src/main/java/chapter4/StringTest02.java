package chapter4;

public class StringTest02 {
	public static void main(String[] args) {

		// mutability 불변성
		String s = "hello";
		System.out.println(s.toUpperCase());
	
		String s1 = "abc";
		String s2 = "def";
		String s3 = "s2";
		
		s2 = s1.toUpperCase();
		System.out.println(s2);		// ABC
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		System.out.println(s4);		// ABC??
		System.out.println(s5);		// !ABC@
		
		// equals 주의할 점
		
	}
	
	private static boolean equalsHello(String s) {
		
			// Hello를 뒤에 적으면, s에 null을 넣을 시 오류가 뜬다.
		return "Hello".equals(s);
	}
}