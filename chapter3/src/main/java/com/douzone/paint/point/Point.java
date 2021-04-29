package com.douzone.paint.point;

import com.douzone.paint.shape.Shape;

public class Point extends Shape{

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("점[" + x + "," + y + "]에 점을 그렸습니다.");

	}

}
