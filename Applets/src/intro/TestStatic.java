package intro;

public class TestStatic {
	private String name;
	private int age;
	private static int num;
	
	public TestStatic(){
		this.name = "Djordje";
		this.age = 27;
		num++;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNum(){
		return num;
	} 
	
	public static int getNumStatic(){
		return num;
	} 
	
	public int getAge(){
		return age;
	}
	
	 public int n(){
		 return this.num;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic t = new TestStatic();
		System.out.println(t.num);
	
	}

}
