package ex_circle_1_1;

public class Circle {
	private double radius;
	private String color;

	// Constructors

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	public Circle(String color) {
		radius = 1.0;
		this.color = color;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// ham get
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "radius = " + radius + ", color = " + color;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	// ham set
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCircle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
}