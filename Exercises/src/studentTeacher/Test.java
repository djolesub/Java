package studentTeacher;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Djordje","Cvijiceva 82");
		Student st2 = new Student("Milena","Cvijiceva 84"); 
		
		System.out.println("Information about Student st1"); 
		st1.addCourseGrade("Math", 10);
		st1.addCourseGrade("Physics", 8);
		st1.addCourseGrade("Chemistry", 9);
		st1.addCourseGrade("Programing", 6);
		st1.addCourseGrade("English", 7);
		st1.addCourseGrade("France", 10); 
		
		st1.printGrades();
		System.out.println(st1.getAvgGrade()); 
		
		System.out.println("Information about Teacher:");
		Teacher te1 = new Teacher("Momir","Cingrijina");
		te1.addCourse("Math");
		te1.addCourse("Physics");
		te1.addCourse("Englih");
		te1.addCourse("Chemistry"); 
		for(String t:te1.getCourses()){
			System.out.println(t);
		}
		
		Person p1  = new Student("Novica","Kolubara 2"); 
		System.out.println("Cudo prirode");
		System.out.println(p1.toString());
		
		
		
		
	}

}
