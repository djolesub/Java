package pointCircle;

public class Circle {
	//Defining fields 
	private Point center;
	private double radius; 
	
	//Defininig Constructor 
	public Circle(){
		this.center = new Point();
		this.radius = 10;
	} 
	
	public Circle(double x,double y,double radius){
		this.center = new Point(x,y);
		this.radius = radius;
	}
	
	public Circle(Point p,double radius){
		this.center = new Point(p.getX(),p.getY());
		this.radius = radius;
	}
	
	//Defining Getters and Setters for radius field 
	public double getRadius(){
		return this.radius;
	}
	
	public double setRadius(double radius){
		return this.radius = radius;
	} 
	
	//Gettere and setters for center field 
	
	public Point getCenter(){
		return this.center;
	}
	
	public void setCenter(Point p){
		this.center = p;
	} 
	
	public void setCenter(double x,double y){
		this.center.setXY(x, y);
	} 
	
	//Getters and Setters for coordinates of center 
	public double getCenterX(){
		return this.center.getX();
	} 
	
	public void setCenterX(double x){
		this.center.setX(x);
	}
	
	public double getCenterY(){
		return this.center.getY();
	} 
	
	public void setCenterY(double y){
		this.center.setY(y);
	} 
	
	public String toString(){
		return "\"Circle[center=("+this.getCenterX()+","+this.getCenterY()+"),radius="+this.getRadius()+"]\"";
	} 
	
	public double getArea(){
		return Math.pow(this.getRadius(),2)* Math.PI;
	} 
	
	public double getCircumference(){
		return 2*this.getRadius()*Math.PI;
	}
	
	public double distance(Circle c1){
		return this.getCenter().distance(c1.getCenter());
	}
	
}
