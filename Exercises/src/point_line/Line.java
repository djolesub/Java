package point_line;

public class Line {
	//Defining Fields
	private Point2D begin;
	private Point2D end; 
	
	//Defining Constructor
	public Line(Point2D p1,Point2D p2){
		begin = p1;
		end = p2;
	} 
	
	public Line(double x1,double y1,double x2,double y2){
		this.begin.setXY(x1,y1);
		this.end.setXY(x2,y2);
		/* this.begin = new Point(x1,y1);
		 * this.end = new Point(x2,y2);
		 * 
		 */
	}
	
	//Getters and Setters for begin and end point of line
	public Point2D getBegin() {
		return this.begin;
	}

	public void setBegin(Point2D begin) {
		this.begin = begin;
	}

	public Point2D getEnd() {
		return end;
	}

	public void setEnd(Point2D end) {
		this.end = end;
	} 
	
	//Get and set x and y coordds of begin point
	public double getBeginX(){
		return this.begin.getX();
	}
	
	public void setBeginX(double x){
		this.begin.setX(x);
	} 
	
	public double getBeginY(){
		return this.begin.getY();
	}
	
	public void setBeginY(double y){
		this.begin.setY(y);
	} 
	
	public double[] getBeginXY(){
		double[] res = {this.begin.getX(),this.begin.getY()};
		return res;
	} 
	
	public void setBeginXY(double x,double y){
		this.begin.setX(x);
		this.begin.setY(y);
	} 
	
	//Get and set x and y of end point
	public double getEndX(){
		return this.end.getX();
	} 
	
	public double getEndY(){
		return this.end.getY();
	} 
	
	public void setEndX(double x){
		this.end.setX(x);
	}
	
	public void setEndY(double y){
		this.end.setY(y);
	} 
	
	public double[] getEndXY(){
		double[] res = {this.end.getX(),this.end.getY()};
		return res;
	} 
	
	public void setEndXY(double x,double y){
		this.end.setX(x);
		this.end.setY(y);
	}
	
	//Line distance using distance method from Point class
	public double getLength(){
		return this.begin.distance(this.end);
	}
	
	
	
	
	
	
	
	
	
}
