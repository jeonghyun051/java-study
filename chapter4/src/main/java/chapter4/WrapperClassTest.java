package chapter4;

public class WrapperClassTest {
	public static void main(String[] args) {
		String s1 = "123456";
		int i = Integer.parseInt(s1);
		
		String s2 = String.valueOf(i);
		
		System.out.println(s1 + ":" + s2);
		
		String s3 = i + "";
		
		System.out.println(s1 + ":" + s2 + ":" + s3);
		
		// 2진수
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		// 16진수
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
	} 

}