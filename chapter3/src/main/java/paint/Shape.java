package paint;

public abstract class Shape {	// 명시적으로 new를 하지 못하도록 추상클래스
	private String lineColor;
	private String fillColor;
	
	public abstract void draw();

}
