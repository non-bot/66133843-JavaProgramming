package ex_circle_1_2;


public class Circle {
	private double radius;

	// Constructors

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	
	// ham get
	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2*radius * Math.PI;
	}
	// ham set
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//ham toString
	public String toString() {
		return "radius = " + radius;
	}
}