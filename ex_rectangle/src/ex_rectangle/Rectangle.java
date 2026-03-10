package ex_rectangle;

public class Rectangle {
	private float length;
	private float width;
	
	// constructor
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	// get
	public float getLength() {
		return this.length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter(){
		return 2*(length+width);
	}
	// set
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	// toString
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
}