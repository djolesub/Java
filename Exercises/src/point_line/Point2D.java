package point_line;

public class Point2D {
	//Defining Fields
	private double x;
	private double y; 
	
	//Defining Constructors
	public Point2D(double x,double y){
		this.x = x;
		this.y = y;
	}  
	
	public Point2D(){
		this.x = 0;
		this.y = 0;
	}

	//Defining setters and getters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}   
	
	//String Representation of object
	public String toString(){
		return "\"("+x+","+y+")\"";
	}
	
	//get array of coordinates
	public double[] getXY(){
		double[] res =  {this.x,this.y};
		return res;
	} 
	
	//Print x and y coords of point
	public void infoXY(){
		double[] res = this.getXY();
		for(double a: res){
			System.out.println(a);
		}
	}
	
	public void setXY(double x,double y){
		this.x = x;
		this.y = y;
	} 
	
	//Distance from point object to some point
	public double distance(double x,double y){
		return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
	}
	
	//Distance between two points
	public double distance(Point2D p){
		return Math.sqrt(Math.pow((this.x - p.getX()),2) + Math.pow((this.y - p.getY()),2));
	}
	
	//Distance from origin
	public double distance(){
		 return Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
	}
	
	
	
	
	}
	
	
	

