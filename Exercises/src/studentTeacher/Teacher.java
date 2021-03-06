package studentTeacher;

public class Teacher extends Person{
	//Defining Fields 
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 5;
	
	//Defining Constructor 
	public Teacher(String name,String address){
		super(name,address);
		numCourses = -1;
		courses = new String[MAX_COURSES];
		
	} 
	
	public String toString(){
		return "Teacher:"+this.getName()+"("+this.getAddress()+")";
	} 
	
	public boolean addCourse(String course){
		for (int i = 0; i < numCourses; i++) {
	         if (courses[i].equals(course)) return false;
	      }
		courses[++numCourses] = course;
		
		return true;
	}
	
	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public boolean removeCourse(String course){
		boolean found = false;
		int courseIndex = -1;
		for(int i=0;i<courses.length;i++){
			if(courses[i].equals(course)){
				courseIndex = i;
				found = true;
				break;
			}
		}
		
		if(found){
			for(int i=courseIndex;i<courses.length;i++){
				courses[i] = courses[i+1];
			}
			numCourses--;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
}
