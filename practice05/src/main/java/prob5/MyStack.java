package prob5;

public class MyStack extends MainApp{
	private String[] data;
	private int top = -1;
	
	public MyStack(int size) {
		data = new String[size];
	}
	
	public void push(String data) {
		top++;
	
		
	}
	
	public String pop() {
		top--;
		return "Hello";
	}
	
	public boolean isEmpty() {
		
		return true;
	}
}