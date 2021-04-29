package chapter4;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point point = new Point(10,10);	
		
		System.out.println(point.getClass());	// reflection
		System.out.println(point.hashCode());	// address 기반의 해싱값
		System.out.println(point.toString());	// getClass() + "@" + hashCode()
		System.out.println(point);
		
	
	}
}