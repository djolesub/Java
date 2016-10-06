package studentTeacher;

public class Student extends Person{
	//Defining fields 
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;
	
	//Defining Constructor 
	public Student(String name,String address){
		super(name,address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	
	//Adding Course Grade 
	public void addCourseGrade(String course,int grade){
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}
	
	//Printing all grades 
	public void printGrades(){
		System.out.println("The grades of student "+this.getName()+" are:");
		for(int a:grades){
			System.out.println(a);
		}
	} 
	
	public double getAvgGrade(){
		double sum = 0;
		int num = grades.length;
		
		for(double a: grades){
			sum+=a;
		} 
		
		double avg = sum/num;
		return avg;
	}
	
	public String toString(){
		return "Student: "+super.toString();
	}
	
}
