package ex_circle_1_1;

public class TestCircle {
   public static void main(String[] args) {
      
      Circle c1 = new Circle();
      
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      
      Circle c2 = new Circle(2.0);
      
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
      c2.setRadius(5.5);
      c2.setColor("green");
		System.out.println(c2.toString	());
		Circle c4 = new Circle();
		c4.setRadius(5.5);
		System.out.println("radius is: " + c4.getRadius());
		c4.setColor("green");
		System.out.println("color is: " + c4.getColor());
	}
}