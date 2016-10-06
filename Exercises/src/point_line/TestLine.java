package point_line;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating two points
		Point2D p1 = new Point2D(20,10);
		Point2D p2 = new Point2D(100,200); 
		
		//Creating Line object 
		
		Line l1 = new Line(p1,p2); 
		System.out.println("Information about line l1"); 
		System.out.println("Begin point is: "+l1.getBegin());
		
		System.out.println("Begin coordinate x is: "+l1.getBeginX());
		System.out.println("Begin coordinate y is: "+l1.getBeginY());
		double[] b = l1.getBeginXY();
		System.out.println("Begin XY array: ");
		for(double a:b){
			System.out.println("Coordinate is: "+a);
		} 
		
		System.out.println("End point is: "+l1.getEnd());
		System.out.println("End coordinate x is: "+l1.getEndX());
		System.out.println("End coordinate y is: "+l1.getEndY());
		System.out.println("Length of line is: "+l1.getLength());
		
		
		
		
		
		
		
	}

}
