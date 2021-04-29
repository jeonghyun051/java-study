package prob01;

public class Printer {
	private int x;
	private boolean y;
	private double z;
	private String name;
	
	public void println(int x) {
		this.x=x;
		System.out.println(x);
	}
	
	public void println(boolean y) {
		this.y=y;
		System.out.println(y);
	}
	
	public void println(double z) {
		this.z=z;
		System.out.println(z);
	}
	
	public void println(String name) {
		this.name=name;
		System.out.println(name);
	}
}