package strings;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating String literal 
		String a = "Djordje";
		String b = "Pavle"; 
		
		//Creating string Object 
		String c = new String("Djordje");
		String d = new String("Pavle"); 
		
		//Using String Builder  
		StringBuilder sb = new StringBuilder();
		sb.append("Appending first time.");
		sb.append("Appending second time.");
		System.out.println("String builder sb:\n"+sb);  
		
		//Convert String to int 
		String num = "123";
		Integer numI = Integer.parseInt(num);
		System.out.println("Square of num is: "+numI*numI); 
		
		//Converting Integer to String 
		int e = 25;
		String eS = String.valueOf(e);
		String eSS = Integer.toString(e);
		
		
		
		
		
		
		
		
	}

}
