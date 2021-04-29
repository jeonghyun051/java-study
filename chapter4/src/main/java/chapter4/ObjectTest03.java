package chapter4;

public class ObjectTest03 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // 67578
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // 다르게 나옴 (주소값 기반)
		
		System.out.println("============================");
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4); // true
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3.hashCode() + ":" + s4.hashCode()); // 67578 - 내용기반임
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4)); // 같게 나옴
		
	}
}