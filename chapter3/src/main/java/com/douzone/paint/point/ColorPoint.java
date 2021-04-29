package com.douzone.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		
		// 부모 생성자를 명시하지 않으면 부모 생성자의 기본생성자가 호출되는데
		// 지금은 지운 상태라서 오류가 뜬다.
		// 그래서 명시적으로 넣어줌
		super(x,y);
//		setX(x);
//		setY(y);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("점[" + getX() + "," + getY()+ "," + color + "]에 점을 그렸습니다.");
	}
	
}