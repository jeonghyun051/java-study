package chapter4;

public class MyClass {
	
	private static MyClass instance;
	
	private MyClass() {
		
	}
	
	// singleton + Factory Method
	public static MyClass getInstance() {
		if(instance == null) {
			instance = new MyClass();
		}
		return instance;	
	}
}