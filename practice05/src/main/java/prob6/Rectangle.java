package prob6;

public class Rectangle extends Shape implements Resizable{
	
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
		
	}
	
	@Override
	public void resize(double s) {
		this.width = this.width * s;
		this.height = this.height * s;
		
	}

	@Override
	double getArea() {
		
		return width * height; 
	}

	@Override
	double getPerimeter() {
		
		return (width+height)*2;
	}
}