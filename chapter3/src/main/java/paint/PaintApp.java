package paint;

public class PaintApp{

	public static void main(String[] args) {
		
		Point point2 = new Point(100,200);
		point2.draw();
		drawShape(point2);
		
		Point point3 = new ColorPoint(50,100,"red");
		point3.setX(50);
		point3.setY(100);
		((ColorPoint)point3).setColor("red");
		//point3.show();
		drawShape(point3);
		
		Rect rect = new Rect();
		drawShape(rect);
		
		Triangle triangle = new Triangle();
		drawShape(triangle);
		
		Circle circle = new Circle();
		drawShape(circle);
	}
	
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}

	/*
	 * public static void drawRect(Rect rect) { rect.draw(); }
	 * 
	 * public static void drawTriangle(Triangle triangle) { triangle.draw(); }
	 */
}