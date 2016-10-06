package point_line;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point2D p1 = new Point2D(20,10);
		Point2D p2 = new Point2D(100,200);
		System.out.println("Information about point p1:");
		System.out.println("P1 point toString method: "+p1);
		System.out.println("P1 point getX() "+p1.getX());
		System.out.println("P1 point getY() "+p1.getY());
		System.out.println("P1 point infoXY() ");
		p1.infoXY();
		System.out.println("P1 point distance distance(x,y)"+p1.distance(100,200));
		System.out.println("P1 point distance distance(Point p)"+p1.distance(p2));
		System.out.println("P1 point distance to Origin "+p1.distance());
		
		
		
		
	}

}
