package chapter4;

public class WrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		
		// Auto Boxing
		Integer j1 = 10;
		Integer j2 = 10;
		
		System.out.println(j1 == j2);
		System.out.println(i == j1);
		System.out.println(i.equals(j1));

	}

}
