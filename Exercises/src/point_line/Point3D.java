package point_line;

public class Point3D extends Point2D{
	//Defining fields 
	private double z;
	
	//Defining Constructor
	public Point3D(){
		super();
		this.z = 0;
	} 
	
	public Point3D(double x,double y,double z){
		super(x,y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public String toString(){
		return "("+this.getX()+","+this.getY()+this.z +")";
	}
	
	
	
}
