package integerStack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50); 
		
		System.out.println(stack.pop()); 
		stack.listData();
		
		
		
		
		
	}

}
