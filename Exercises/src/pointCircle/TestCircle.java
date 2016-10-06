package pointCircle;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(20,10);
		Point p2 = new Point(100,200); 
		
		Circle c1 = new Circle(p1,100);
		Circle c2 = new Circle(p2,200); 
		
		System.out.println("Information about first circle:");
		System.out.println("Area: "+c1.getArea());
		System.out.println("Circumference: "+c1.getCircumference());
		System.out.println("Distance to c2: "+c1.distance(c2));
		
		
		
		
	}

}
